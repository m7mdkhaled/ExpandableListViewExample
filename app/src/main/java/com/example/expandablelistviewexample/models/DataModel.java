package com.example.expandablelistviewexample.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataModel {
    @SerializedName("SubService")
    List<SubServiceModel> subServicesModels;
    @SerializedName("MainServices")
    List<MainServiceModel> mainServicesModels;

    public List<SubServiceModel> getSubServicesModels() {
        return subServicesModels;
    }

    public void setSubServicesModels(List<SubServiceModel> subServicesModels) {
        this.subServicesModels = subServicesModels;
    }

    public List<MainServiceModel> getMainServicesModels() {
        return mainServicesModels;
    }

    public void setMainServicesModels(List<MainServiceModel> mainServicesModels) {
        this.mainServicesModels = mainServicesModels;
    }
}
