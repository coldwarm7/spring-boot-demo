package com.dharma.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Created by Coldwarm on 18/6/3.
 */
public class JdbcDaoLImpl {

    @Autowired
    protected JdbcTemplate jdbcTemplate;

    public <T> T queryForObject(String sql,Class<T> cls,Object... args){
        Assert.hasText(sql,"sql not empty");
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(cls),args);
    }

    public <T> List<T> queryForObjectList(String sql, Class<T> cls, Object... args){
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(cls),args);
    }
}
