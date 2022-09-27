package com.example.expandablelistviewexample.viewmodels;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

import com.example.expandablelistviewexample.client.ServicePriceListClient;
import com.example.expandablelistviewexample.models.ResponseModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ServicePriceListViewModel extends ViewModel {
    Context context;
    public MutableLiveData<ResponseModel> ServicePriceListMutableData = new MutableLiveData<>();

    public void getServicePriceLists() {
        ServicePriceListClient.getINSTANCE().GetServicePriceList().enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                if (response.isSuccessful()) {
                    try {
                        ServicePriceListMutableData.setValue(response.body());
                        System.out.println(response.body());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                Toast.makeText(context, "There is no data", Toast.LENGTH_SHORT).show();
                System.out.println(t);
            }
        });
    }

}
