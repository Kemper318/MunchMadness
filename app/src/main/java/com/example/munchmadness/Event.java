package com.example.munchmadness;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Event {
    // Name
    private String name;
    // Date
    private LocalDateTime dateTime;
    // Deadline
    private LocalDateTime deadlineDateTime;
    // List of restaurants
    private List<String> restaurants;
    // Creator's username
    private String creatorUsername;
    // List of invitees (their usernames)
    private List<String> inviteeUsernames;

    public Event(String name,
                 LocalDateTime dateTime,
                 LocalDateTime deadlineDateTime,
                 String creatorUsername) {
        this.name = name;
        this.dateTime = dateTime;
        this.deadlineDateTime = deadlineDateTime;
        this.creatorUsername = creatorUsername;
        this.restaurants = new ArrayList<>();
        this.inviteeUsernames = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDeadlineDateTime() {
        return deadlineDateTime;
    }

    public void setDeadlineDateTime(LocalDateTime deadlineDateTime) {
        this.deadlineDateTime = deadlineDateTime;
    }

    public List<String> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<String> restaurants) {
        this.restaurants = restaurants;
    }

    public List<String> getInviteeUsernames() {
        return inviteeUsernames;
    }

    public void setInviteeUsernames(List<String> inviteeUsernames) {
        this.inviteeUsernames = inviteeUsernames;
    }
}
