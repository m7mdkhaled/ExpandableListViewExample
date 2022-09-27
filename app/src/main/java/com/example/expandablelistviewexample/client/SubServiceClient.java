package com.example.expandablelistviewexample.client;

import android.content.Context;

import com.example.expandablelistviewexample.data.SubServiceInterface;
import com.example.expandablelistviewexample.models.ResponseModel;
import com.example.expandablelistviewexample.util.Utilities;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SubServiceClient {
    public SubServiceInterface subServiceInterface;
    private static SubServiceClient INSTANCE;
    public Context context;

    public SubServiceClient() {
        Retrofit retrofit = new Retrofit.Builder()

                .baseUrl(ApiConnection.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        subServiceInterface = retrofit.create(SubServiceInterface.class);
        Call<ResponseModel> call = subServiceInterface.GetSubServices(Utilities.getToken(context));
        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {

            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                System.out.println(t);
            }
        });
    }
    public static SubServiceClient getINSTANCE() {
        if (null == INSTANCE) {
            INSTANCE = new SubServiceClient();
        }
        return INSTANCE;
    }
    public Call<ResponseModel> GetSubServices() {
        return subServiceInterface.GetSubServices(Utilities.getToken(context));
    }
}

