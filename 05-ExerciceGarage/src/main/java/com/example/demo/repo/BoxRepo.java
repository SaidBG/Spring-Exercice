package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.Box;
@Component
public interface BoxRepo extends CrudRepository<Box, Long> {

}
