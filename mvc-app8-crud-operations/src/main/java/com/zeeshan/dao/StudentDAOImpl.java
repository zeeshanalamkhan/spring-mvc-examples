/**
 * 
 */
package com.zeeshan.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.zeeshan.bo.StudentBO;

import lombok.Data;

/**
 * @author ZEESHAN KHAN
 *
 */

@Data
public class StudentDAOImpl implements StudentDAO {

	private static final String GET_ALL_STUDENTS_QRY = "SELECT SNO, SNAME, SADD FROM STUDENT2";
	private static final String GET_STUDENT_BY_ID = "SELECT SNO, SNAME, SADD FROM STUDENT2 WHERE SNO=?";
	private static final String INSERT_STUDENT = "INSERT INTO STUDENT2(SNO, SNAME, SADD) VALUES(?,?,?)";
	private static final String UPDATE_STUDENT_BY_ID = "UPDATE STUDENT2 SET SNAME=?, SADD=? WHERE SNO=?";
	private static final String DELETE_STUDENT_BY_ID = "DELETE STUDENT2 WHERE SNO=?";
	private JdbcTemplate jt;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zeeshan.dao.StudentDAO#getAllStudent()
	 */
	@Override
	public List<StudentBO> getAllStudent() {

		List<StudentBO> listBO = jt.query(GET_ALL_STUDENTS_QRY, new StudentRowMapper());
		return listBO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zeeshan.dao.StudentDAO#insert(com.zeeshan.bo.StudentBO)
	 */
	@Override
	public int insert(StudentBO bo) {
		int count = jt.update(INSERT_STUDENT, bo.getSno(), bo.getSname(), bo.getSadd());
		return count;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zeeshan.dao.StudentDAO#getStudentById(int)
	 */
	@Override
	public StudentBO getStudentById(int id) {

		StudentBO bo = jt.queryForObject(GET_STUDENT_BY_ID, new StudentRowMapper(), id);
		return bo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zeeshan.dao.StudentDAO#update(com.zeeshan.bo.StudentBO)
	 */
	@Override
	public int update(StudentBO bo) {

		int count = jt.update(UPDATE_STUDENT_BY_ID, bo.getSname(), bo.getSadd(), bo.getSno());
		return count;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zeeshan.dao.StudentDAO#deleteById(int)
	 */
	@Override
	public int deleteById(int id) {
		int count = jt.update(DELETE_STUDENT_BY_ID, id);
		return count;
	}

	private class StudentRowMapper implements RowMapper<StudentBO> {

		@Override
		public StudentBO mapRow(ResultSet rs, int rowNum) throws SQLException {

			StudentBO bo = new StudentBO(rs.getInt(1), rs.getString(2), rs.getString(3));
			return bo;
		}

	}

}
