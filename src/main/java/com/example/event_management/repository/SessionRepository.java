package com.example.event_management.repository;

import com.example.event_management.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SessionRepository extends JpaRepository<Session, Long> {
    @Query("SELECT s FROM Session s WHERE CONCAT(s.eventName, ' ', s.venueName, ' ', s.startDate, ' ', s.endDate) LIKE %?1%")
    List<Session> search(String keyword);
}
