package com.zeeshan.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.zeeshan.bo.StudentBO;

import lombok.Data;

@Data
public class StudentInsertDAOImpl implements StudentInsertDAO {

	private static final String INSERT_STUDENT_QUERY = "INSERT INTO STUDENTS(SNO, SNAME, SADD) VALUES(?,?,?)";
	private JdbcTemplate jt;

	@Override
	public int insert(StudentBO bo) {
		int count = jt.update(INSERT_STUDENT_QUERY, bo.getSno(), bo.getSname(), bo.getSadd());
		return count;
	}

}
