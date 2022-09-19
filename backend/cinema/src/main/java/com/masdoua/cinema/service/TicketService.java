package com.masdoua.cinema.service;

import com.masdoua.cinema.model.Theater;
import com.masdoua.cinema.model.Ticket;
import com.masdoua.cinema.repository.TheaterRepository;
import com.masdoua.cinema.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Iterable<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Ticket getOneTicket(UUID id) {
        return ticketRepository.findById(id).get();
    }



}
