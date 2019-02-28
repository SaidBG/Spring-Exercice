package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.Garage;
@Component
public interface GarageRepo extends CrudRepository<Garage, Long> {

}
