package com.example.yelpdemo.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YelpReview {

    private String id;
    private String url;
    private String text;
    private Integer rating;
    private User user;
    @SerializedName("time_created")
    private String timeCreated;

    public String getId(){return id;}
    public void setId(String id){this.id = id;}

    public String getUrl(){return url;}
    public void setUrl(String url){this.url = url;}

    public String getText(){return text;}
    public void setText(String text){this.text = text;}

    public Integer getRating(){return rating;}
    public void setRating(Integer rating){this.rating = rating;}

    public User getUser(){return user;}
    public void setUser(User user){this.user = user;}

    public String getTimeCreated(){return timeCreated;}
    public void setTimeCreated(String timeCreated){this.timeCreated = timeCreated;}

    @Override
    public String toString() {
        return "YelpReview{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", text='" + text + '\'' +
                ", rating=" + rating +
                ", user=" + user +
                ", timeCreated='" + timeCreated + '\'' +
                '}';
    }
}
