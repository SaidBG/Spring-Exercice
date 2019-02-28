package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.Voiture;
@Component
public interface VoitureRepo extends CrudRepository<Voiture, Long> {

}
