package com.portifolio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portifolio.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
