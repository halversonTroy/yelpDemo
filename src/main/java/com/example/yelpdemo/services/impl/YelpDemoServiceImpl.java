package com.example.yelpdemo.services.impl;

import com.example.yelpdemo.BusinessNotFoundException;
import com.example.yelpdemo.beans.YelpReviews;
import com.example.yelpdemo.services.YelpDemoService;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class YelpDemoServiceImpl implements YelpDemoService {

    private final static Logger logger = LoggerFactory.getLogger(YelpDemoServiceImpl.class);

    @Value("${yelp.api}")
    private String yelpApi;

    /**
     * @see YelpDemoService#getReviews(String) 
     * @param businessId
     * @return
     */
    public YelpReviews getReviews(String businessId){

        StringBuilder builder = new StringBuilder("https://api.yelp.com/v3/businesses/");
        builder.append(businessId);
        builder.append("/reviews");

        HttpResponse<String> response = getYelpResponse(builder.toString());

        if(response == null || response.statusCode() != 200){
            throw new BusinessNotFoundException(businessId);
        }

        return new Gson().fromJson(response.body(), YelpReviews.class);

    }

    private HttpResponse<String> getYelpResponse(String apiUrl){

        HttpResponse<String> response = null;

        try{

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .header("content-type", "application/json")
                    .header("Authorization", yelpApi)
                    .build();
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response);

        }catch(Exception ex){
            logger.error("Exception thrown while retrieving yelp api data: " + ex);
        }

        return response;

    }

}
