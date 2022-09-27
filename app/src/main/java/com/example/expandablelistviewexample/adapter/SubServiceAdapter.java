package com.example.expandablelistviewexample.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.expandablelistviewexample.R;
import com.example.expandablelistviewexample.models.ResponseModel;
import com.example.expandablelistviewexample.models.ServicePriceListModel;
import com.example.expandablelistviewexample.models.SubServiceModel;
import com.example.expandablelistviewexample.viewmodels.ServicePriceListViewModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubServiceAdapter extends RecyclerView.Adapter<SubServiceAdapter.ViewHolder>{

    Context mContext;
    private List<SubServiceModel> subServiceModelList;
    private List<ServicePriceListModel> servicePriceListModels = new ArrayList<>();

    public SubServiceAdapter(Context context, List<SubServiceModel> subServiceModelList, List<ServicePriceListModel> servicePriceListModels) {
        this.mContext = context;
        this.subServiceModelList = subServiceModelList;
        this.servicePriceListModels = servicePriceListModels;
    }

    @NonNull
    @Override
    public SubServiceAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ll = LayoutInflater.from(mContext);
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.expandable_listview_parent, parent,false);
        return new SubServiceAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SubServiceAdapter.ViewHolder holder, int position) {
        holder.SubServiceName.setText("" + subServiceModelList.get(position).getSubServiceNameAr());
    }

    @Override
    public int getItemCount() {
        return null!=subServiceModelList?subServiceModelList.size():0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView SubServiceName;
        RecyclerView ServicePriceRV;
        ServicePriceListAdapter servicePriceListAdapter;
        ServicePriceListViewModel servicePriceListViewModel;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            SubServiceName = itemView.findViewById(R.id.SubServiceName);
            ServicePriceRV = itemView.findViewById(R.id.RVServicePriceList);
            ServicePriceRV.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));
            servicePriceListViewModel.getServicePriceLists();
            FillServicePriceList();
            final CardView cardView = itemView.findViewById(R.id.cardView_device_coin_token);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (servicePriceListAdapter == null) {
                        servicePriceListAdapter = new ServicePriceListAdapter(mContext, servicePriceListModels);
//                        servicePriceListAdapter.get
                    }else {
                        ServicePriceRV.setAdapter(null);
                        servicePriceListAdapter = null;
                    }
                }
            });
        }

        private void FillServicePriceList() {
            servicePriceListViewModel.ServicePriceListMutableData(mContext, new Observer<ResponseModel>() {
                @Override
                public void onChanged(ResponseModel responseModel) {

                }
            })
        }
    }
}

