package com.studybuddy.calendar_service.controller;


import com.studybuddy.calendar_service.model.CalendarEvent;
import com.studybuddy.calendar_service.repository.CalendarEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calendar")
public class CalendarController {

    @Autowired
    private CalendarEventRepository calendarEventRepository;

    @GetMapping
    public ResponseEntity<List<CalendarEvent>> getAllEvents() {
        return ResponseEntity.ok(calendarEventRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<CalendarEvent> createEvent(@RequestBody CalendarEvent event) {
        CalendarEvent savedEvent = calendarEventRepository.save(event);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEvent);
    }

    // Additional CRUD operations can be implemented as needed
}
