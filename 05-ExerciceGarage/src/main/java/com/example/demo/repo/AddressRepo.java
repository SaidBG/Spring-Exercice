package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.Address;
@Component
public interface AddressRepo extends CrudRepository<Address, Long> {

}
