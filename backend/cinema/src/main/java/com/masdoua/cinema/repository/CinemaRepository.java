package com.masdoua.cinema.repository;

import com.masdoua.cinema.model.Cinema;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CinemaRepository extends CrudRepository<Cinema, UUID> {

}
