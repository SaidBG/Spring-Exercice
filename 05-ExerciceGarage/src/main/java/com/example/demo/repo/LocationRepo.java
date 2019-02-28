package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.Location;
@Component
public interface LocationRepo extends CrudRepository<Location, Long> {

}
