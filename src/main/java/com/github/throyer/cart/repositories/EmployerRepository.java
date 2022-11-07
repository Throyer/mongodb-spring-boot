package com.github.throyer.cart.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.github.throyer.cart.models.Employer;

@Repository
public interface EmployerRepository extends MongoRepository<Employer, String> { }
