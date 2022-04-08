package com.example.yelpdemo.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YelpReviews {

    private List<YelpReview> reviews;
    private Integer total;

    public YelpReviews(){}

    public List<YelpReview> getReviews(){return reviews;}
    public void setYelpReviews(List<YelpReview> reviews){this.reviews = reviews;}

    public Integer getTotal(){return total;}
    public void setTotal(Integer total){this.total = total;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YelpReviews that = (YelpReviews) o;
        return Objects.equals(reviews, that.reviews) && Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviews, total);
    }

    @Override
    public String toString() {
        return "YelpReviews{" +
                "total=" + total +
                ", reviews=" + reviews +
                '}';
    }
}
