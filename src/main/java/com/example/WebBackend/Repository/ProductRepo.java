package com.example.WebBackend.Repository;

import com.example.WebBackend.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {


}
