package com.dharma.demo.controller;

import com.dharma.demo.dao.ProductDaoImple;
import com.dharma.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Coldwarm on 18/6/3.
 */
@RestController
@RequestMapping(value = "/api")
public class apiController {

    @Autowired
    private ProductDaoImple productDaoImple;

    @RequestMapping(value = "/get/id/{id}",method = RequestMethod.GET)
    public Product get(@PathVariable Integer id){
        return productDaoImple.getById(id);
    }

    @RequestMapping(value = "/get/name/{name}",method = RequestMethod.GET)
    public Product getByName(@PathVariable String name){
        return productDaoImple.getByName(name);
    }

    @RequestMapping(value = "/add/name/{name}/price/{price}",method = RequestMethod.POST)
    public int insert(@PathVariable String name,@PathVariable Double price){
        return productDaoImple.insert(new Product(name,price));
    }

    @RequestMapping(value = "/delete/id/{id}",method = RequestMethod.DELETE)
    public int deleteById(@PathVariable Integer id){
        return productDaoImple.deleteById(id);
    }

    @RequestMapping(value = "/update/id/{id}/name/{name}/price/{price}",method = RequestMethod.PUT)
    public int updateById( @PathVariable String name, @PathVariable Double price,@PathVariable Integer id){
        return productDaoImple.updateById(new Product(id,name,price));
    }



}
