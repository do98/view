package com.example.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Classes;

@Service
public interface ClassesService {
	public List<Classes> getClasses();

	public int addClasses(Classes classes);

	public int deleteClasses(long classesid);

	public Classes getClassById(long classId);

	public int update(Classes classes);
}
