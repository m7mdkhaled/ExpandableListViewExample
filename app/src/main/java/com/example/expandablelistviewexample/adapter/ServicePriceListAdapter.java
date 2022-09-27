package com.example.expandablelistviewexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.expandablelistviewexample.R;
import com.example.expandablelistviewexample.models.ServicePriceListModel;

import java.util.List;

public class ServicePriceListAdapter extends RecyclerView.Adapter<ServicePriceListAdapter.ViewHolder> {
    Context mContext;
    private List<ServicePriceListModel> servicePriceListModels;

    public ServicePriceListAdapter(Context mContext, List<ServicePriceListModel> servicePriceListModels) {
        this.mContext = mContext;
        this.servicePriceListModels = servicePriceListModels;
    }

    @NonNull
    @Override
    public ServicePriceListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ll = LayoutInflater.from(mContext);
        View view = LayoutInflater.from(mContext).inflate(R.layout.expandable_listview_child, parent, false);

        return new ServicePriceListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ServicePriceListAdapter.ViewHolder holder, int position) {
        holder.ServicePriceListTxt.setText("Section " + servicePriceListModels.get(position).getDescriptionAr());
    }

    @Override
    public int getItemCount() {
        return null!=servicePriceListModels?servicePriceListModels.size():0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView ServicePriceListTxt;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ServicePriceListTxt = itemView.findViewById(R.id.ServicePriceDesc);
        }
    }
}
