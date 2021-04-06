package com.example.bcaguidesnepal;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bcaguidesnepal.ui.home.HomeFragment;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.myViewHolder> implements Filterable {
    ArrayList<datamodel> dataHolder;
    ArrayList<datamodel> backupDataHolder;
    HomeFragment context;


    public myAdapter(ArrayList<datamodel> dataHolder, HomeFragment context) {
        this.dataHolder = dataHolder;
        this.context= context;
        backupDataHolder=new ArrayList<>(dataHolder);
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final myViewHolder holder, final int position) {
        holder.img.setImageResource(dataHolder.get(position).getImg());
        holder.subName.setText(dataHolder.get(position).subject);
        holder.creditHr.setText(dataHolder.get(position).creditHr);

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(context.getContext(),DetailActivity.class);
                intent.putExtra("subject",holder.subName.getText().toString().trim());
                intent.putExtra("sub_key",position);
                context.startActivity(intent);
                Toast.makeText(context.getActivity(), holder.subName.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    @Override
    public Filter getFilter() {
        return filter;
    }
    Filter filter= new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence searchKey) {
            ArrayList<datamodel> filteredData= new ArrayList<>();
            if(searchKey.toString().isEmpty()){
                filteredData.addAll(backupDataHolder);
            }
            else {
                for( datamodel obj : backupDataHolder)
                {
                    if(obj.getSubject().toString().toLowerCase().contains(searchKey.toString().toLowerCase()))
                    {
                        filteredData.add(obj);
                    }
                }
            }
            FilterResults results= new FilterResults();
            results.values=filteredData;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            dataHolder.clear();
            dataHolder.addAll((ArrayList<datamodel>)results.values);
            notifyDataSetChanged();

        }
    };

    class myViewHolder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView subName;
        TextView creditHr;
        RelativeLayout relativeLayout;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.subImage);
            subName=itemView.findViewById(R.id.subTitle);
            creditHr=itemView.findViewById(R.id.creditHr);
            relativeLayout=itemView.findViewById(R.id.single_item_layout);
        }
    }
}
