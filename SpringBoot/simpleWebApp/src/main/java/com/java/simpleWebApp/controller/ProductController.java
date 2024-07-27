package com.java.simpleWebApp.controller;

import com.java.simpleWebApp.model.Product;
import com.java.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService pService;
    @RequestMapping("/products")
    public List<Product> getProduct(){
        return pService.getProducts();
    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return pService.getProductById(id);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        pService.addProduct(product);
    }
    //Update the product
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        pService.updateProduct(product);
    }
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id){
        pService.deleteProduct(id);
    }

}
