package com.example.WebBackend.Service;

import com.example.WebBackend.Model.Product;
import com.example.WebBackend.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
//    List<Product> products= new ArrayList<>(Arrays.asList(new Product(101,"IPhone",100000),
//                                            new Product(102,"Laptop",150000),
//                                            new Product(103,"Earbuds",1500)));
    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId){
        return repo.findById(prodId).get();
    }

    public void addProduct(Product product){
        repo.save(product);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }


    public void deleteProduct(int id) {
        repo.deleteById(id);
    }

}
