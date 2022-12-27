package com.example.demo.controller;

import com.example.demo.dto.ProductTemplateDTO;
import com.example.demo.model.ProductTemplate;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.ProductTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
@RestController
public class ProductTemplateController {
    @Autowired
    private ProductTemplateRepository productTemplateRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/ProductTemplate")
    public ProductTemplate PostTemplate(@RequestBody ProductTemplateDTO productTemplateDTO){
        try {

            return productTemplateRepository.save(productTemplateDTO.getProductTemplate());

        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @GetMapping("/ProductTemplate")
    public List<ProductTemplate> allProductTemplate(){
        return productTemplateRepository.findAll();
    }


}
