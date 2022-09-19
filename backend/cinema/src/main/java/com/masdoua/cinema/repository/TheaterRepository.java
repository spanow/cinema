package com.masdoua.cinema.repository;

import com.masdoua.cinema.model.Cinema;
import com.masdoua.cinema.model.Theater;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TheaterRepository extends CrudRepository<Theater, UUID> {

}
