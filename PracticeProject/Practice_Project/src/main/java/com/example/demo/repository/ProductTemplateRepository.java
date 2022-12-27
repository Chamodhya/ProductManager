package com.example.demo.repository;

import com.example.demo.model.Product;
import com.example.demo.model.ProductTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTemplateRepository extends JpaRepository<ProductTemplate, Long > {
}
