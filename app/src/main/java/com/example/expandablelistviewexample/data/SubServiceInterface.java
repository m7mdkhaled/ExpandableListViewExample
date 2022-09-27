package com.example.expandablelistviewexample.data;

import com.example.expandablelistviewexample.models.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface SubServiceInterface {
    @GET("SubService")
    public Call<ResponseModel> GetSubServices(@Header("authorization") String token);



}
