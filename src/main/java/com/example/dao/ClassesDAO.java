package com.example.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.model.Classes;

public class ClassesDAO extends BaseDAO<Classes> {

	public ClassesDAO(JdbcTemplate _jdbcTemplate) {
		super(_jdbcTemplate);
	}
	
}
