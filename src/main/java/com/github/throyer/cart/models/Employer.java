package com.github.throyer.cart.models;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document("employer")
public class Employer {
  @Id
  private String id;
  private String name;
  private Integer age;
  private BigDecimal payment;
  private Employer boss;
}
