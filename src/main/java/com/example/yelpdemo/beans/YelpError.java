package com.example.yelpdemo.beans;

import java.util.Objects;

public class YelpError {

    private String code;
    private String description;
    private String searchedTerm;

    public YelpError(){}

    public YelpError(String code, String description, String searchedTerm){
        this.code = code;
        this.description = description;
        this.searchedTerm = searchedTerm;
    }

    public String getCode(){return code;}
    public void setCode(String code){this.code = code;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}

    public String getSearchedTerm(){return searchedTerm;}
    public void setSearchedTerm(String searchedTerm){this.searchedTerm = searchedTerm;}
    
    @Override
    public String toString() {
        return "Error{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
