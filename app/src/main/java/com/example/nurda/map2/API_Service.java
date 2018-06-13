package com.example.nurda.map2;

import com.example.nurda.map2.POJO.Example;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

public interface API_Service {
        @GET("api/place/nearbysearch/json?sensor=true&key=AIzaSyCTF9kCdGIM42Ka52nhmyBGQ6dtjn1Cohg")
    Call<Example> getNearbyPlaces(@Query("type") String type, @Query("location") String location, @Query("radius") int radius);
}
