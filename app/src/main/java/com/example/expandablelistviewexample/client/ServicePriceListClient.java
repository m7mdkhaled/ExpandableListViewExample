package com.example.expandablelistviewexample.client;

import android.content.Context;

import com.example.expandablelistviewexample.data.ServicePriceListInterface;
import com.example.expandablelistviewexample.models.ResponseModel;
import com.example.expandablelistviewexample.util.Utilities;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServicePriceListClient {
    public ServicePriceListInterface servicePriceListInterface;
    private static ServicePriceListClient INSTANCE;
    public Context context;

    public ServicePriceListClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiConnection.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        servicePriceListInterface = retrofit.create(ServicePriceListInterface.class);
    }
    public static ServicePriceListClient getINSTANCE() {
        if (null == INSTANCE) {
            new ServicePriceListClient();
        }
        return INSTANCE;
    }
    public Call<ResponseModel> GetServicePriceList() {
        return servicePriceListInterface.GetServicesPriceList(Utilities.getToken(context));
    }
    public Call<ResponseModel> GetServicePriceListById(int id) {
        return servicePriceListInterface.GetServicePriceListById(id, Utilities.getToken(context));
    }
}

