package com.zeeshan.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.zeeshan.command.StudentCommand;

import lombok.Data;

@Data
public class StudentRegistrationDAO {

	private static final String INSERT_INTO_STUDENT = "INSERT INTO STUDENT3 VALUES(?, ?, ? ,?)";

	private JdbcTemplate jt;

	public int registerStudent(StudentCommand cmd) {

		int count = jt.update(INSERT_INTO_STUDENT, cmd.getName(), cmd.getDob(), cmd.getDoj(), cmd.getDom());
		return count;
	}
}
