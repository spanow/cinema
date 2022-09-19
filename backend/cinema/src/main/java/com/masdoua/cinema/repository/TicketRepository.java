package com.masdoua.cinema.repository;

import com.masdoua.cinema.model.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TicketRepository extends CrudRepository<Ticket, UUID> {
}
