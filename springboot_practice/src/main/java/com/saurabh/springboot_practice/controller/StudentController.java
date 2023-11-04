package com.saurabh.springboot_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@RequestMapping("/home")
	public String showMsg() {
		return "This is my SpringBoot Application creation through Maven Project:"+new java.util.Date();
	}
	@GetMapping(value="search/{roll}")
	public String search(@PathVariable int roll) {
		if(roll==10) {
			return "Student name is Saurabh Gupta";
		}
		else {
			return "Student not found";
		}
	}
	@RequestMapping(value="find")
	public String find(@RequestParam (value="roll")int roll) {
		if(roll==10) {
			return "Student name is [using Request Param]";
		}
		else {
			return "Student not found  [using Request Param]";
		}
	}
	@PostMapping(value="findByName")
	public String findByName(@RequestBody String name) {
		System.out.println(name);
		if(name.equalsIgnoreCase("Saurabh")) {
			return "Student Fullname is Saurabh Gupta Roll no is 1010";
		}
		else if(name.equalsIgnoreCase("Siddhi")) {
			return "Siddhi Fullname is Siddhi Gupta Roll no is 1812";
		}
		else {
			return "Student name is not in database";
		}
	}

}
