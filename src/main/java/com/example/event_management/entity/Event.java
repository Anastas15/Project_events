package com.example.event_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String eventType; // Тип мероприятия
    private String startDate;
    private String endDate;
    private String organizer;
    private String location; // Локация мероприятия
    // Сеттер
    private String eventPoster;

    public Event() {}

}
