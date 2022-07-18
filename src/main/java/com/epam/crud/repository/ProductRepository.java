package com.epam.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epam.crud.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
