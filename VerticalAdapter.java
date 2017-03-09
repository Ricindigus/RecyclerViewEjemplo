package com.example.apoyo03_ui.recyclerviewejemplo;

import android.app.Application;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apoyo03-ui on 9/03/2017.
 */

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.MyViewHolder> {

        private List<String> verticalList;
        private Application application;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView txtView;
            public RecyclerView horizontal_recycler_view;

            public MyViewHolder(View view) {
                super(view);
                txtView = (TextView) view.findViewById(R.id.txtView);
                horizontal_recycler_view = (RecyclerView) view.findViewById(R.id.horizontal_recycler_view);
            }
        }
        public VerticalAdapter(List<String> verticalList, Application aplication) {
            this.verticalList = verticalList;
            this.application = aplication;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.single_item_vertical, parent, false);
            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final MyViewHolder holder, final int position) {

            holder.txtView.setText(verticalList.get(position));
            holder.txtView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });
            ArrayList<String> horizontalList = new ArrayList<>();
            horizontalList.add("horizontal 1");
            horizontalList.add("horizontal 2");
            horizontalList.add("horizontal 3");
            horizontalList.add("horizontal 4");
            horizontalList.add("horizontal 5");
            horizontalList.add("horizontal 6");
            horizontalList.add("horizontal 7");
            horizontalList.add("horizontal 8");
            horizontalList.add("horizontal 9");
            horizontalList.add("horizontal 10");
            HorizontalAdapter horizontalAdapter = new HorizontalAdapter(horizontalList);
            LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(application, LinearLayoutManager.HORIZONTAL, false);
            holder.horizontal_recycler_view.setLayoutManager(horizontalLayoutManager);
            holder.horizontal_recycler_view.setAdapter(horizontalAdapter);
        }

        @Override
        public int getItemCount() {
            return verticalList.size();
        }
}
