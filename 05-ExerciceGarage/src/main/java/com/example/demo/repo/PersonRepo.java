package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.Person;
@Component
public interface PersonRepo extends CrudRepository<Person, Long> {

}
