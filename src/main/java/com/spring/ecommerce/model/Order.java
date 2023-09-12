package com.spring.ecommerce.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String number;
    private Date creationDate;
    private Date receivedDate;
    private Double total;

    @ManyToOne
    private User user;

    @OneToOne(mappedBy = "order")
    private OrderDetail orderDetail;

}
