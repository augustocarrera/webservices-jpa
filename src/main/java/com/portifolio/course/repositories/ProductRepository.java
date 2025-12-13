package com.portifolio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portifolio.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
