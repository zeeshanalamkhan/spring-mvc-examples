/**
 * 
 */
package com.zeeshan.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.zeeshan.bo.EmpBO;

import lombok.Data;

/**
 * @author ZEESHAN KHAN
 *
 */
@Data
public class EmpDAOImpl implements EmpDAO {

	private static final String GET_ALL_EMPS = "SELECT EMPNO, ENAME, JOB, SAL FROM EMP";
	private static final String INSERT_EMP = "INSERT INTO EMP(EMPNO,ENAME, JOB, SAL)VALUES(?,?,?,?)";

	private JdbcTemplate jt;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zeeshan.dao.EmpDAO#getAllEmp()
	 */
	@Override
	public List<EmpBO> getAllEmp() {

		List<EmpBO> listBO = jt.query(GET_ALL_EMPS, new EmpRowMapper());
		return listBO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zeeshan.dao.EmpDAO#registerEmp(com.zeeshan.bo.EmpBO)
	 */
	@Override
	public Integer registerEmp(EmpBO bo) {
		
		int count = jt.update(INSERT_EMP, bo.getEmpNo(), bo.getEname(), bo.getJob(), bo.getSalary());
		return count;
	}

	private class EmpRowMapper implements RowMapper<EmpBO> {

		@Override
		public EmpBO mapRow(ResultSet rs, int rowNum) throws SQLException {

			EmpBO bo = new EmpBO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));

			return bo;
		}
		
	}
}
