package com.jarvis.controller;

import com.jarvis.enums.Gender;
import com.jarvis.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class StudentController {

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(UUID.randomUUID(), "Ram", "Gopal", "ramgopalbhat10@gmail.com", Gender.MALE));
		students.add(new Student(UUID.randomUUID(), "Subramanya", "Bhat", "ramgopalbhat10@gmail.com", Gender.MALE));
		students.add(new Student(UUID.randomUUID(), "Shruthi", "Bhat", "shruthibhat4@gmail.com", Gender.FEMALE));
		return students;
	}
}
