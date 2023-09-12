package com.spring.ecommerce.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
@Setter @Getter @AllArgsConstructor @NoArgsConstructor @ToString
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String image;
    private double precio;
    private int cantidad;

    @ManyToOne
    private User user;
}
