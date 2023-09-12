package com.spring.ecommerce.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table( name = "details")
@Setter @Getter @AllArgsConstructor @NoArgsConstructor @ToString
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double quantity;
    private Double price;
    private Double total;

    @OneToOne
    private Order order;

    @OneToOne
    private Product product;
}
