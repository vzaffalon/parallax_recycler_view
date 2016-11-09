package com.yimobile.teste.controllers;

/**
 * Created by vzaffalon on 09/11/16.
 */

public class Beer {
    private int id;
    private String type;
    private String name;
    private String description;
    private String abv;
    private String brand;
    private String style;
    private int style_id;
    private String origin;
    private int origin_id;
    private int numer_of_ratings;
    private String average_rating;
    private String origin_profile_picture;
    private String profile_picture_medium;

    public Beer(int id, String type, String name, String description, String abv,
                String brand, String style, int style_id, String origin,
                int origin_id, int numer_of_ratings, String average_rating,
                String origin_profile_picture, String profile_picture_medium) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
        this.abv = abv;
        this.brand = brand;
        this.style = style;
        this.style_id = style_id;
        this.origin = origin;
        this.origin_id = origin_id;
        this.numer_of_ratings = numer_of_ratings;
        this.average_rating = average_rating;
        this.origin_profile_picture = origin_profile_picture;
        this.profile_picture_medium = profile_picture_medium;
    }

    //constructor for json direct serialization
    public Beer(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAbv() {
        return abv;
    }

    public void setAbv(String abv) {
        this.abv = abv;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getStyle_id() {
        return style_id;
    }

    public void setStyle_id(int style_id) {
        this.style_id = style_id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getOrigin_id() {
        return origin_id;
    }

    public void setOrigin_id(int origin_id) {
        this.origin_id = origin_id;
    }

    public int getNumer_of_ratings() {
        return numer_of_ratings;
    }

    public void setNumer_of_ratings(int numer_of_ratings) {
        this.numer_of_ratings = numer_of_ratings;
    }

    public String getAverage_rating() {
        return average_rating;
    }

    public void setAverage_rating(String average_rating) {
        this.average_rating = average_rating;
    }

    public String getOrigin_profile_picture() {
        return origin_profile_picture;
    }

    public void setOrigin_profile_picture(String origin_profile_picture) {
        this.origin_profile_picture = origin_profile_picture;
    }

    public String getProfile_picture_medium() {
        return profile_picture_medium;
    }

    public void setProfile_picture_medium(String profile_picture_medium) {
        this.profile_picture_medium = profile_picture_medium;
    }

}
