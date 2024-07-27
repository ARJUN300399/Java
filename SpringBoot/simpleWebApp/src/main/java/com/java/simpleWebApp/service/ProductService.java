package com.java.simpleWebApp.service;
import com.java.simpleWebApp.model.Product;
import com.java.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
/*     private List<Product> products =  new ArrayList<>(Arrays.asList(
             new Product(101, "HPLaptop", 59000),
             new Product(102, "DELL Desktop", 29000),
             new Product(103, "Old Monk", 290)
     ));*/
    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product());
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}
