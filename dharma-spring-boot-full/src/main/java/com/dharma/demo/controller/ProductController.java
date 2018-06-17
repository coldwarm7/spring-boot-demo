package com.dharma.demo.controller;

import com.dharma.demo.dao.JpaProductDao;
import com.dharma.demo.model.Product;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

import java.util.List;



/**
 * Created by Coldwarm on 18/6/3.
 */
@RestController
@RequestMapping(value = "/product")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private JpaProductDao jpaProductDao;

    @Cacheable(value = "product",key = "#id",unless = "#result.price>5000")
    @RequestMapping(value = "/get/id/{id}",method = RequestMethod.GET)
    public Product get(@PathVariable Integer id){
        logger.info("get product by id = " + id);
        return jpaProductDao.findById(id).orElse(new Product("Not exist",0.0));
    }

    @RequestMapping(value = "/get/name/{name}/price/{price}",method = RequestMethod.GET)
    public Product get(@PathVariable String name,@PathVariable Double price){
        return jpaProductDao.findByNameAndPrice(name, price);
    }

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<Product> get(){
        return jpaProductDao.findAll();
    }
}
