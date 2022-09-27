package com.example.expandablelistviewexample.models;

import com.google.gson.annotations.SerializedName;

public class ResponseModel {

    @SerializedName("Status")
    public int Status;
    @SerializedName("Message")
    public String Message;
    @SerializedName("Data")
    public DataModel Data;

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

//    public List<DataModel> getData() {
//        return Data;
//    }
//
//    public void setData(List<DataModel> data) {
//        Data = data;
//    }

    public DataModel getData() {
        return Data;
    }

    public void setData(DataModel data) {
        this.Data = data;
    }

}
