package com.example.expandablelistviewexample.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.example.expandablelistviewexample.R;
import com.example.expandablelistviewexample.adapter.SubServiceAdapter;
import com.example.expandablelistviewexample.models.ResponseModel;
import com.example.expandablelistviewexample.models.ServicePriceListModel;
import com.example.expandablelistviewexample.models.SubServiceModel;
import com.example.expandablelistviewexample.viewmodels.SubServiceViewModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SubServiceAdapter subServiceAdapter;
    SubServiceViewModel subServiceViewModel;
    private List<SubServiceModel> subServiceModelList = new ArrayList<>();
    private List<ServicePriceListModel> servicePriceListModels = new ArrayList<>();

    private ItemTouchHelper.Callback mItemTouchCallback = new ItemTouchHelper.SimpleCallback(
            ItemTouchHelper.UP | ItemTouchHelper.DOWN,
            0) {
        @Override
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder,
                              RecyclerView.ViewHolder target) {

            final int fromPos = viewHolder.getAdapterPosition();
            final int toPos = target.getAdapterPosition();

            subServiceAdapter.notifyItemMoved(fromPos, toPos);

            return true; // true if moved, false otherwise
        }

        @Override
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView testRecyclerView = (RecyclerView)findViewById(R.id.RVSubService);
        testRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL));
        subServiceAdapter = new SubServiceAdapter(this, subServiceModelList, servicePriceListModels);
        subServiceViewModel.getSubServices();
        testRecyclerView.setAdapter(subServiceAdapter);

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(mItemTouchCallback);
        itemTouchHelper.attachToRecyclerView(testRecyclerView);
        FillListSubServices();

    }
    private void FillListSubServices() {
        subServiceViewModel.SubServiceMutableLiveData.observe(MainActivity.this, new Observer<ResponseModel>() {
            @Override
            public void onChanged(ResponseModel responseModel) {
//                subServicesModelList = new ArrayList<>();
                subServiceModelList = responseModel.getData().getSubServicesModels();
//                expandableDetailList = new HashMap<subServicesModelList, List<ServicePriceListsModel>>();
//                expandableDetailList = responseModel.getData().getMap();
//                subServicesModelList = responseModel.getData().getMainServicesModels().get(0).getSubServicesModel();
//                subServiceAdapter = new SubServiceAdapter(MainServicesAndSubServices.this,subServicesModelList,expandableDetailList);
//                ELV_SubServices.setAdapter(subServiceAdapter);
            }
        });
    }

}