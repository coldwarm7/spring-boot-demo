package com.dharma.demo.dao;

import com.dharma.demo.model.Product;


/**
 * Created by Coldwarm on 18/6/3.
 */
public interface ProductDao {

    int insert(Product product);

    int deleteById(int id);

    int updateById(Product product);

    Product getById(int id);

    Product getByName(String name);


}
