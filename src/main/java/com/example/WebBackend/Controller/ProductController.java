package com.example.WebBackend.Controller;

import com.example.WebBackend.Model.Product;
import com.example.WebBackend.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> products(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
         service.addProduct(product);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id){
        service.deleteProduct(id);
    }

}
