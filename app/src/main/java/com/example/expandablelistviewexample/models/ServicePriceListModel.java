package com.example.expandablelistviewexample.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ServicePriceListModel {
    @SerializedName("Id")
    public int Id;
    @SerializedName("SubServiceId")
    public int subServiceId;
    @SerializedName("DescriptionAr")
    public String descriptionAr;
    @SerializedName("DescriptionEn")
    public String getDescriptionEn;
    @SerializedName("Price")
    public int price;
    @SerializedName("Cost")
    public int cost;
//    @SerializedName("Tasks")
//    public List<TasksModel> tasksModel;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getSubServiceId() {
        return subServiceId;
    }

    public void setSubServiceId(int subServiceId) {
        this.subServiceId = subServiceId;
    }

    public String getDescriptionAr() {
        return descriptionAr;
    }

    public void setDescriptionAr(String descriptionAr) {
        this.descriptionAr = descriptionAr;
    }

    public String getGetDescriptionEn() {
        return getDescriptionEn;
    }

    public void setGetDescriptionEn(String getDescriptionEn) {
        this.getDescriptionEn = getDescriptionEn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

//    public List<TasksModel> getTasksModel() {
//        return tasksModel;
//    }
//
//    public void setTasksModel(List<TasksModel> tasksModel) {
//        this.tasksModel = tasksModel;
//    }
}
