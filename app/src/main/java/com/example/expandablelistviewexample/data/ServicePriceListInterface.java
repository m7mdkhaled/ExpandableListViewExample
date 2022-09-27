package com.example.expandablelistviewexample.data;

import com.example.expandablelistviewexample.models.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface ServicePriceListInterface {
    @GET("ServicePriceList")
    public Call<ResponseModel> GetServicesPriceList(@Header("authorization") String token);

    @GET("ServicePriceList/{id}")
    public Call<ResponseModel> GetServicePriceListById(@Path("id") int Id, @Header("authorization") String token);
}

