package com.zeeshan.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.zeeshan.bo.StudentBO;

import lombok.Data;

@Data
public class StudentInsertDAOImpl implements StudentInsertDAO {

	private static final String INSERT_STUDENT_QRY = "INSERT INTO STUDENTS VALUES(?,?,?)";
	private JdbcTemplate jt;

	@Override
	public int insert(StudentBO sbo) {

		int cnt = jt.update(INSERT_STUDENT_QRY, sbo.getSno(), sbo.getSname(), sbo.getSadd());

		return cnt;
	}

}
