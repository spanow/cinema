package com.masdoua.cinema.service;

import com.masdoua.cinema.model.Cinema;
import com.masdoua.cinema.model.Theater;
import com.masdoua.cinema.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TheaterService {

    @Autowired
    private TheaterRepository theaterRepository;

    public Iterable<Theater> getAllTheaters() {
        return theaterRepository.findAll();
    }

    public Theater createTheater(Theater theater) {
        return theaterRepository.save(theater);
    }

    public Theater getOneTheater(UUID id) {
        return theaterRepository.findById(id).get();
    }

    public Theater deleteTheater(UUID id) {
        Theater theater = theaterRepository.findById(id).get();
        theaterRepository.deleteById(id);
        return theater;
    }

    public Theater updateTheater(UUID id, Theater t) {
        Theater theater = theaterRepository.findById(id).get();
        theater.setName(t.getName());
        theater.setNum_places(t.getNum_places());
        theater.setCinema(t.getCinema());
        theaterRepository.save(theater);
        return theater;
    }

}
