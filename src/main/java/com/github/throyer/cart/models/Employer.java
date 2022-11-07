package com.github.throyer.cart.models;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document("employer")
public class Employer {
  @Id
  @Schema(example = "636903f4961a83479e8b9313")
  private String id;

  @Schema(example = "Jubileu da silva")
  private String name;

  @Schema(example = "19")
  private Integer age;

  @Schema(example = "2800.0")
  private BigDecimal payment;

  @Schema(hidden = true)
  @JsonIgnore
  private Employer boss;
}
