package com.example.yelpdemo;

public class BusinessNotFoundException extends RuntimeException{

    public BusinessNotFoundException(){
        super("No results could be found:");
    }

    public BusinessNotFoundException(String businessName){
        super(businessName);
    }
}
