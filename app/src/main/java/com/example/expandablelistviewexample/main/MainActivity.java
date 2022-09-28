package com.example.expandablelistviewexample.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.expandablelistviewexample.R;
import com.example.expandablelistviewexample.adapter.SubServiceAdapter;
import com.example.expandablelistviewexample.models.ResponseModel;
import com.example.expandablelistviewexample.models.ServicePriceListModel;
import com.example.expandablelistviewexample.models.SubServiceModel;
import com.example.expandablelistviewexample.viewmodels.ServicePriceListViewModel;
import com.example.expandablelistviewexample.viewmodels.SubServiceViewModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<SubServiceModel> expandableListTitle;
    List<ServicePriceListModel> expandableListDetail;
    HashMap<String, SubServiceModel> subjects;
    ServicePriceListViewModel servicePriceListViewModel;

    //    private ItemTouchHelper.Callback mItemTouchCallback = new ItemTouchHelper.SimpleCallback(
//            ItemTouchHelper.UP | ItemTouchHelper.DOWN,
//            0) {
//        @Override
//        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder,
//                              RecyclerView.ViewHolder target) {
//
//            final int fromPos = viewHolder.getAdapterPosition();
//            final int toPos = target.getAdapterPosition();
//
//            subServiceAdapter.notifyItemMoved(fromPos, toPos);
//
//            return true; // true if moved, false otherwise
//        }
//
//        @Override
//        public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
//
//        }
//    };
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
//        expandableListView = (ExpandableListView) findViewById(R.id.ELVSubService);
//        expandableListDetail = servicePriceListViewModel.getServicePriceLists();
//        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
//        expandableListAdapter = new CustomExpandableListAdapter(this, expandableListTitle, expandableListDetail);
//        expandableListView.setAdapter(expandableListAdapter);
//        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
//
//            addItem()
//            @Override
//            public void onGroupExpand(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        expandableListTitle.get(groupPosition) + " List Expanded.",
//                        Toast.LENGTH_SHORT).show();
//            }
//        });

//        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

//            @Override
//            public void onGroupCollapse(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        expandableListTitle.get(groupPosition) + " List Collapsed.",
//                        Toast.LENGTH_SHORT).show();
//
//            }
//        });
//
//        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
//            @Override
//            public boolean onChildClick(ExpandableListView parent, View v,
//                                        int groupPosition, int childPosition, long id) {
//                Toast.makeText(
//                        getApplicationContext(),
//                        expandableListTitle.get(groupPosition)
//                                + " -> "
//                                + expandableListDetail.get(
//                                expandableListTitle.get(groupPosition)).get(
//                                childPosition), Toast.LENGTH_SHORT
//                ).show();
//                return false;
//            }
//        });
//    }

//}
