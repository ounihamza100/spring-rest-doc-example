package com.hamzaouni.springrestdocsexampel;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Hamza Ouni
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "ORDER_TB")
public class Order {
    @Id
    private int orderId;
    private String name;
    private int quantity;
    private double price;
}
