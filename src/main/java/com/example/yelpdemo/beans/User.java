package com.example.yelpdemo.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private String id;
    @SerializedName("profile_url")
    private String profileUrl;
    @SerializedName("image_url")
    private String imageUrl;
    private String name;

    public User(){}

    public String getId(){return id;}
    public void setId(String id){this.id = id;}

    public String getProfileUrl(){return profileUrl;}
    public void setProfileUrl(String profileUrl){this.profileUrl = profileUrl;}

    public String getImageUrl(){return imageUrl;}
    public void setImageUrl(String imageUrl){this.imageUrl = imageUrl;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", profileUrl='" + profileUrl + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
