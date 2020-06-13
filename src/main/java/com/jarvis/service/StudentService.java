package com.jarvis.service;

import com.jarvis.dao.StudentDAO;
import com.jarvis.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

	private final StudentDAO studentDAO;

	@Autowired
	public StudentService(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	public List<Student> getAllStudents() {
		return studentDAO.selectAllStudents();
	}
}
