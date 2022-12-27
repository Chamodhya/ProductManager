package com.example.demo.controller;


import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService ps;

    @GetMapping("/products/show")
    public String showProducts(Model model){
        System.out.println("show products");
        List<Product> products= ps.getAll();
        return "select-product";
    }

}
