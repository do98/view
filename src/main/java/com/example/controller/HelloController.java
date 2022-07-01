package com.example.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Classes;
import com.example.service.ClassesService;

@Controller
public class HelloController {

	@Autowired
	ClassesService classesService;

	@GetMapping("/list")
	public String getAll(Model model) {
		List<Classes> list = classesService.getClasses();
		model.addAttribute("list", list);
		return "classes/list";
	}

	@GetMapping("/show-form-add")
	public String showFormAdd() {
		return "classes/add";
	}

	@PostMapping("/add")
	public String addClass( @RequestParam("cid") long cid,
			@RequestParam("startday")  @DateTimeFormat(pattern = "yyyy-MM-dd") Date startday, @RequestParam("endday") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endday,
			@RequestParam("wstudent") String wstudent, @RequestParam("timelearn") String timelearn,
			@RequestParam("status") String status, @RequestParam("userid") long userid, Model model) throws ParseException {
		
			Classes classes = new Classes();
			
			classes.setCid(cid);
			classes.setStartday(startday);
			classes.setEndday(endday);
			classes.setWstudent(wstudent);
			classes.setTimelearn(timelearn);
			classes.setStatus(status);
			classes.setUserid(userid);
			
			classesService.addClasses(classes);
			List<Classes> list = classesService.getClasses();
			model.addAttribute("list", list);
			return "classes/list";
	}
	
	@GetMapping("/show-form-delete/{id}")
	public String showDelete(@PathVariable("id") long id, Model model) {
		Classes cls = classesService.getClassById(id);
		if(cls != null) {
			model.addAttribute("classes", cls);
			return "classes/delete";
		} else {
			return "error404";
		}
		
	}
	
	@PostMapping("/delete")
	public String deleteClasses(@Param("id") long id, Model model) {
		Classes cls = classesService.getClassById(id);
		if(cls != null) {
			classesService.deleteClasses(id);
		}
		List<Classes> list = classesService.getClasses();
		model.addAttribute("list", list);
		return "classes/list";
		
	}
	// sua thong tin lop
		@PostMapping("/update")
		public String  update(@Param("id") long id, @RequestParam("cid") long cid,
				@RequestParam("startday")  @DateTimeFormat(pattern = "yyyy-MM-dd") Date startday, @RequestParam("endday") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endday,
				@RequestParam("wstudent") String wstudent, @RequestParam("timelearn") String timelearn,
				@RequestParam("status") String status, @RequestParam("userid") long userid, Model model) {
			Classes cls = classesService.getClassById(id);
			if(cls != null) {
				cls.setId(id);
				cls.setCid(cid);
				cls.setStartday(startday);
				cls.setEndday(endday);
				cls.setWstudent(wstudent);
				cls.setTimelearn(timelearn);
				cls.setStatus(status);
				cls.setUserid(userid);
				classesService.update(cls);
			}
			List<Classes> list = classesService.getClasses();
			model.addAttribute("list", list);
			return "classes/list";
		}
		@GetMapping("/show-form-update/{id}")	
		public String showUpdate(@PathVariable("id") long id, Model model) {
			Classes cls = classesService.getClassById(id);
			if(cls != null) {
				model.addAttribute("classes", cls);
				return "classes/update";
			} else {
				return "error404";
			}
		}
}
