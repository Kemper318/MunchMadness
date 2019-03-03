package com.example.munchmadness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class EventListActivity extends AppCompatActivity {

    private RecyclerView eventListView;
    private List<Event> eventList;
    private Button newEventButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_event_list);

        eventList = getEvents();

        eventListView = findViewById(R.id.event_list_view);

        newEventButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startNewEventIntent = new Intent(getBaseContext(), android.com.hoosgotplans.munchmadness.NewEventActivity.class);

                Bundle b = new Bundle();
                b.putInt("Event", 1); //TODO: Pass in the actual Event to the EventDetailActivity
                startNewEventIntent.putExtras(b);
                startActivity(startNewEventIntent);
            }
        });
    }

    public List<Event> getEvents() {
        return new ArrayList<>();
    }
}