package com.masdoua.cinema.repository;

import com.masdoua.cinema.model.Cinema;
import com.masdoua.cinema.model.Session;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.UUID;

public interface SessionRepository extends CrudRepository<Session, UUID> {
    Iterable<Session> findByTheater_Cinema(Cinema cinema);
    Iterable<Session> findByTheater_CinemaAndStartDateBetween(Cinema cinema, LocalDateTime start_date, LocalDateTime end_date);
}
