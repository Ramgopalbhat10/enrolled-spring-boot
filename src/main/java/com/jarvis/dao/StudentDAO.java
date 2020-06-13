package com.jarvis.dao;

import com.jarvis.enums.Gender;
import com.jarvis.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class StudentDAO {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public StudentDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Student> selectAllStudents() {
		String sql = "SELECT id, first_name, last_name, email, gender FROM student";

		return jdbcTemplate.query(sql, mapStudentFromDb());
	}

	private RowMapper<Student> mapStudentFromDb() {
		return (resultSet, i) -> {
			String studentIdStr = resultSet.getString("id");
			UUID studentId = UUID.fromString(studentIdStr);

			String firstName = resultSet.getString("first_name");
			String lastName = resultSet.getString("last_name");
			String email = resultSet.getString("email");

			String genderStr = resultSet.getString("gender").toUpperCase();
			Gender gender = Gender.valueOf(genderStr);

			return new Student(studentId, firstName, lastName, email, gender);
		};
	}
}
