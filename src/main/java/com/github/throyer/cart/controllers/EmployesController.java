package com.github.throyer.cart.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.github.throyer.cart.models.Employer;
import com.github.throyer.cart.repositories.EmployerRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/employes")
public class EmployesController {
  private EmployerRepository repository;

  @GetMapping
  public Page<Employer> index(Pageable pageable) {
    return this.repository.findAll(pageable);
  }

  @GetMapping("/{employer_id}")
  public ResponseEntity<Employer> show(
    @PathVariable("employer_id") String id
  ) {
    return this.repository.findById(id)
      .map(employer -> ResponseEntity.ok(employer))
        .orElseGet(() -> ResponseEntity.notFound().build());
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Employer create(@RequestBody Employer employer) {
    return this.repository.save(employer);
  }
}
