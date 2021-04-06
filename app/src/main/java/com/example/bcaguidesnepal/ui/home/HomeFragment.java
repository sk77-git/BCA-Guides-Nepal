package com.example.bcaguidesnepal.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bcaguidesnepal.R;
import com.example.bcaguidesnepal.datamodel;
import com.example.bcaguidesnepal.myAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<datamodel> dataHolder;
    myAdapter adapter;


    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        setHasOptionsMenu(true);


        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=view.findViewById(R.id.recView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataHolder= new ArrayList<>();

        datamodel ob1= new datamodel(R.drawable.computerfundamentals,"Computer Fundamentals \n(CACS101)","Credit Hours:4");
        dataHolder.add(ob1);
        datamodel ob2= new datamodel(R.drawable.society,"Society and Technology \n(CASO102)","Credit Hours:3");
        dataHolder.add(ob2);
        datamodel ob3= new datamodel(R.drawable.english,"English I \n(CAEN103)","Credit Hour:3");
        dataHolder.add(ob3);
        datamodel ob4= new datamodel(R.drawable.mathematics,"Mathematics I \n(CAMT104)","Credit Hour:3");
        dataHolder.add(ob4);
        datamodel ob5= new datamodel(R.drawable.digitallogic,"Digital Logic \n(CACS105)","Credit Hour:3");
        dataHolder.add(ob5);
        datamodel ob6= new datamodel(R.drawable.cprogramming,"C Programming \n(CACS151)","Credit Hour:4");
        dataHolder.add(ob6);
        datamodel ob7= new datamodel(R.drawable.accounting,"Financial Accounting \n(CAACI152)","Credit Hour:3");
        dataHolder.add(ob7);
        datamodel ob8= new datamodel(R.drawable.english,"English II \n(CAEN153)","Credit Hour:3");
        dataHolder.add(ob8);
        datamodel ob9= new datamodel(R.drawable.mathematics,"Mathematics II \n(CAMT154)","Credit Hour:3");
        dataHolder.add(ob9);
        datamodel ob10= new datamodel(R.drawable.microprocessor,"Microprocessor & Computer Acrh (CACS155)","Credit Hour:3");
        dataHolder.add(ob10);
        /*datamodel ob11= new datamodel(R.drawable.ic_launcher_background,"Subject: eleventh Subject","Credit Hour:5");
        dataHolder.add(ob11);
        datamodel ob12= new datamodel(R.drawable.ic_launcher_background,"Subject: tweleveth Subject","Credit Hour:5");
        dataHolder.add(ob12);
*/
        recyclerView.setAdapter(new myAdapter(dataHolder,this));

        return view;
    }

    // Menu Item Inflater
   /* @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.main, menu);
        MenuItem searchBox=menu.findItem(R.id.action_search);
        SearchView searchView= (SearchView) searchBox.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        super.onCreateOptionsMenu(menu, inflater);
    }*/
}