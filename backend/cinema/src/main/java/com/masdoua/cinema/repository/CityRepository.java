package com.masdoua.cinema.repository;

import com.masdoua.cinema.model.Cinema;
import com.masdoua.cinema.model.City;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CityRepository extends CrudRepository<City, UUID> {
}
