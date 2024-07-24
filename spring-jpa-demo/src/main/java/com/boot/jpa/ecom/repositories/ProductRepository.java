package com.boot.jpa.ecom.repositories;

import com.boot.jpa.ecom.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
