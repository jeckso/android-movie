package com.course.heroku.jeckso.android_moviedb.model;

import com.google.gson.annotations.SerializedName;



public class Trailer extends BaseModel<TrailerData> {

    @SerializedName("id")
    private int id;

    public Trailer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
