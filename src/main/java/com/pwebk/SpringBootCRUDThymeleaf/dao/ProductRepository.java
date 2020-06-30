package com.pwebk.SpringBootCRUDThymeleaf.dao;

import com.pwebk.SpringBootCRUDThymeleaf.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product , Long> {
}
