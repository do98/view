package com.example.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.dao.ClassesDAO;
import com.example.model.Classes;
import com.example.service.ClassesService;

@Service
public class ClassesServiceImpl implements ClassesService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Classes> getClasses() {
		ClassesDAO classesDAO = new ClassesDAO(jdbcTemplate);
		String sql = "select * from classes";
		Object[] parameter = new Object[] {};
		BeanPropertyRowMapper rowMapper = BeanPropertyRowMapper.newInstance(Classes.class);
		return classesDAO.getList(sql, null, rowMapper);
	}

	@Override
	public int addClasses(Classes classes) {
		String sql1 = "INSERT INTO classes(cid, startday, endday, wstudent, timelearn, status, userid) VALUES(?,?,?,?,?,?,?)";
		Object[] parameter = new Object[] { classes.getCid(), classes.getStartday(), classes.getEndday(), 
				classes.getWstudent(), classes.getTimelearn(), classes.getStatus(), classes.getUserid()};
		return jdbcTemplate.update(sql1,parameter);
	}

	@Override
	public int deleteClasses(long classesid) {
		String sql2 = "DELETE FROM classes WHERE ID =?";
		Object[] parameter = new Object[] {classesid};
		return jdbcTemplate.update(sql2,parameter);
	}

	@Override
	public Classes getClassById(long classId) {
		ClassesDAO classesDAO = new ClassesDAO(jdbcTemplate);
		String sql = "select * from classes where id = ?";
		Object[] parameter = new Object[] {classId};
		BeanPropertyRowMapper rowMapper = BeanPropertyRowMapper.newInstance(Classes.class);
		return classesDAO.getOne(sql, parameter, rowMapper);
	}

	@Override
	public int update(Classes classes) {
		String sql = "UPDATE classes SET cid = ?, startday = ?, endday = ?, wstudent=?, timelearn=?, status=?, userid=? WHERE id = ?";
		Object[] parameter = new Object[] {classes.getCid(), classes.getStartday(), classes.getEndday(), 
				classes.getWstudent(), classes.getTimelearn(), classes.getStatus(), classes.getUserid(), classes.getId()};
		return jdbcTemplate.update(sql, parameter);
	}
}
