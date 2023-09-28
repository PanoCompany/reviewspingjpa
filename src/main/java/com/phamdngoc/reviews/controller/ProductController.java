package com.phamdngoc.reviews.controller;

import com.phamdngoc.reviews.ProductEntity;
import com.phamdngoc.reviews.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductRepo productRepo;

    @GetMapping("")
    public List<ProductEntity> getAllProduct(){
        return productRepo.findAll();
    }

    @PostMapping("")
    public ProductEntity addProduct(@RequestBody ProductEntity product){
        return productRepo.save(product);
    }
}
