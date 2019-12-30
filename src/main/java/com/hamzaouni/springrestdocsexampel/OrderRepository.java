package com.hamzaouni.springrestdocsexampel;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Hamza Ouni
 */
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
