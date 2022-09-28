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

public class SubServiceAdapter extends BaseExpandableListAdapter{

    Context mContext;
    private List<SubServiceModel> subServiceModelList = new ArrayList<>();
    private HashMap<String, List<ServicePriceListModel>> servicePriceListModels;


    public SubServiceAdapter(Context mContext, List<SubServiceModel> subServiceModelList, HashMap<String, List<ServicePriceListModel>> servicePriceListModels) {
        this.mContext = mContext;
        this.subServiceModelList = subServiceModelList;
        this.servicePriceListModels = servicePriceListModels;
    }

    @Override
    public Object getChild(int listPosition, int expandedListPosition) {
        return this.servicePriceListModels.get(this.subServiceModelList.get(listPosition).getSubServiceNameAr())
                .get(expandedListPosition).getDescriptionAr();
    }

    @Override
    public long getChildId(int listPosition, int expandedListPosition) {
        return expandedListPosition;
    }

    @Override
    public View getChildView(int listPosition, final int expandedListPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        final String expandedListText = (String) getChild(listPosition, expandedListPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.expandable_listview_child, null);
        }
        TextView expandedListTextView = (TextView) convertView
                .findViewById(R.id.ServicePriceDesc);
        expandedListTextView.setText(expandedListText);
        return convertView;
    }

    @Override
    public int getChildrenCount(int listPosition) {
        return this.servicePriceListModels.get(this.subServiceModelList.get(listPosition).getSubServiceNameAr())
                .size();
    }

    @Override
    public Object getGroup(int listPosition) {
        return this.subServiceModelList.get(listPosition).getSubServiceNameAr();
    }

    @Override
    public int getGroupCount() {
        return this.subServiceModelList.size();
    }

    @Override
    public long getGroupId(int listPosition) {
        return listPosition;
    }

    @Override
    public View getGroupView(int listPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String listTitle = (String) getGroup(listPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.mContext.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.expandable_listview_parent, null);
        }
        TextView listTitleTextView = (TextView) convertView
                .findViewById(R.id.SubServiceName);
        listTitleTextView.setTypeface(null, Typeface.BOLD);
        listTitleTextView.setText(listTitle);
        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int listPosition, int expandedListPosition) {
        return true;
    }}

