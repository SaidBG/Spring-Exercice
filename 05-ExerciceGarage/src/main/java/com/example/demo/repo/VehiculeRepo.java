package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.Vehicule;
@Component
public interface VehiculeRepo extends CrudRepository<Vehicule, Long> {

}
