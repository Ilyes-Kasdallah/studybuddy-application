package com.studybuddy.calendar_service.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "calendar_events")
public class CalendarEvent {
    @Id
    private String id;
    private String title;
    private String start;
    private String end;
    // Add any other relevant fields, such as description or user

    // Constructors, getters, and setters
    public CalendarEvent() {}

    public CalendarEvent(String title, String start, String end) {
        this.title = title;
        this.start = start;
        this.end = end;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}

