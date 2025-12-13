package com.portifolio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portifolio.course.entities.OrderItem;
import com.portifolio.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
