package com.example.expandablelistviewexample.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SubServiceModel {
    @SerializedName("Id")
    public int Id;
    @SerializedName("MainServiceId")
    public int mainServiceId;
    @SerializedName("SubServiceNameAr")
    public String subServiceNameAr;
    @SerializedName("SubServiceNameEn")
    public String getSubServiceNameEn;
    @SerializedName("ServicePriceLists")
    public List<ServicePriceListModel> servicePriceListsModel;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getMainServiceId() {
        return mainServiceId;
    }

    public void setMainServiceId(int mainServiceId) {
        this.mainServiceId = mainServiceId;
    }

    public String getSubServiceNameAr() {
        return subServiceNameAr;
    }

    public void setSubServiceNameAr(String subServiceNameAr) {
        this.subServiceNameAr = subServiceNameAr;
    }

    public String getGetSubServiceNameEn() {
        return getSubServiceNameEn;
    }

    public void setGetSubServiceNameEn(String getSubServiceNameEn) {
        this.getSubServiceNameEn = getSubServiceNameEn;
    }

    public List<ServicePriceListModel> getServicePriceListsModel() {
        return servicePriceListsModel;
    }

    public void setServicePriceListsModel(List<ServicePriceListModel> servicePriceListsModel) {
        this.servicePriceListsModel = servicePriceListsModel;
    }
}
