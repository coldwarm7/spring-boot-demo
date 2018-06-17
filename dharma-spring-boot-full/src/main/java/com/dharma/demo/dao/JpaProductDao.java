package com.dharma.demo.dao;

import com.dharma.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Coldwarm on 18/6/3.
 */
public interface JpaProductDao extends JpaRepository<Product,Integer> {
    Product findByNameAndPrice(String name, Double price);
}
