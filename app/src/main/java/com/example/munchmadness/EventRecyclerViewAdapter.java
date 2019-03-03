package com.example.munchmadness;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class EventRecyclerViewAdapter extends RecyclerView.Adapter {

    private List<Event> eventList;
    private Context context;
    private EventListActivity eventListActivity;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int position) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }
}
