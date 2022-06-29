package com.example.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BaseDAO<D> {
//    Statement st = null;
    public  JdbcTemplate jdbcTemplate;
    public BaseDAO(JdbcTemplate _jdbcTemplate){
        jdbcTemplate = _jdbcTemplate;
    }

    /**
     *
     * @param sql
     * @param parameter
     * @param beanPropertyRowMapper
     * @return List<Obj>
     */
    public List<D> getList(String sql, Object[] parameter, BeanPropertyRowMapper beanPropertyRowMapper){
        return jdbcTemplate.query(sql,parameter, beanPropertyRowMapper);
    }

    /**
     *
     * @param sql
     * @param parameter
     * @param beanPropertyRowMapper
     * @return 1 obj
     */
    public D getOne(String sql, Object[] parameter, BeanPropertyRowMapper beanPropertyRowMapper){
        return (D) jdbcTemplate.queryForObject(sql, parameter, beanPropertyRowMapper);
    }
    public Integer getCountRow(String sql, Object[] parameter){
        return jdbcTemplate.queryForObject(sql,parameter,Integer.class);
    }
    public int modifyModel(String sql, Object[] parameter){
        return jdbcTemplate.update(sql,parameter);
    }
}
