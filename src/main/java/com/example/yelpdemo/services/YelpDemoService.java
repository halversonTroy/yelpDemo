package com.example.yelpdemo.services;

import com.example.yelpdemo.beans.YelpReviews;

public interface YelpDemoService {

    /**
     * A service method that will search for yelp reviews based on the passed in businessId String.
     *
     * A YelpReviews object is returned which will contain a collection of individual reviews.
     *
     * @param businessId
     * @return
     */
    YelpReviews getReviews(String businessId);

}
