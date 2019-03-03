package com.example.munchmadness;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class EventDetailActivity extends AppCompatActivity {
    private RecyclerView eventListView;
    private List<String> restaurantList;
    private List<String> invitedList;
    private Button newEventButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b = getIntent().getExtras();
        int value = b.getInt("Event");
        //TODO: This needs to be the event ^, for now is a string
        setContentView(R.layout.activity_event_details);

        String dateToParse = "2016-05-23 10:24:59";
        LocalDateTime dateTime = LocalDateTime.parse(dateToParse, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String dateToParse2 = "2019-05-23 07:24:59";
        LocalDateTime dateTime2 = LocalDateTime.parse(dateToParse2, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        Event event = new Event("name", dateTime,dateTime2,"alex" );
        restaurantList = event.getRestaurants();
        invitedList = event.getInviteeUsernames();

        TextView eventText = (TextView) findViewById(R.id.event_name);
        eventText.setText(event.getName());



    }
}

