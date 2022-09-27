package com.example.expandablelistviewexample.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MainServiceModel {
    @SerializedName("Id")
    public int Id;
    @SerializedName("ServiceTypeId")
    public int ServiceTypeId;
    @SerializedName("MainServiceNameAr")
    public String MainServiceNameAr;
    @SerializedName("MainServiceNameEn")
    public String MainServiceNameEn;
    @SerializedName("SubServices")
    public List<SubServiceModel> subServicesModel;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getServiceTypeId() {
        return ServiceTypeId;
    }

    public void setServiceTypeId(int serviceTypeId) {
        ServiceTypeId = serviceTypeId;
    }

    public String getMainServiceNameAr() {
        return MainServiceNameAr;
    }

    public void setMainServiceNameAr(String mainServiceNameAr) {
        MainServiceNameAr = mainServiceNameAr;
    }

    public String getMainServiceNameEn() {
        return MainServiceNameEn;
    }

    public void setMainServiceNameEn(String mainServiceNameEn) {
        MainServiceNameEn = mainServiceNameEn;
    }

    public List<SubServiceModel> getSubServicesModel() {
        return subServicesModel;
    }

    public void setSubServicesModel(List<SubServiceModel> subServicesModel) {
        this.subServicesModel = subServicesModel;
    }

}
