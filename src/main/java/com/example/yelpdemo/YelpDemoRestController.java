package com.example.yelpdemo;

import com.example.yelpdemo.beans.YelpReviews;
import com.example.yelpdemo.services.YelpDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class YelpDemoRestController {

    @Autowired
    YelpDemoService yelpDemoService;

    @GetMapping("/pizzaReviews")
    public EntityModel<YelpReviews> getPizzaReviews(){

        YelpReviews pizzaReviews = yelpDemoService.getReviews("balistreris-italian-american-ristorante-wauwatosa");

        return EntityModel.of(pizzaReviews, linkTo(methodOn(YelpDemoRestController.class).getPizzaReviews()).withSelfRel());

    }

    @GetMapping("/reviews/{businessId}")
    @ResponseBody
    public EntityModel<YelpReviews> getReviewsFor(@PathVariable String businessId){

        YelpReviews businessReviews = yelpDemoService.getReviews(businessId);

        return EntityModel.of(businessReviews, linkTo(methodOn(YelpDemoRestController.class).getReviewsFor(businessId)).withSelfRel());

    }


}
