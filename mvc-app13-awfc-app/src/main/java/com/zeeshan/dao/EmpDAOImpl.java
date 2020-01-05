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

	private static final String GET_ALL_EMPS = "SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO FROM EMP";
	private static final String INSERT_EMP = "INSERT INTO EMP(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)VALUES(?,?,?,?,?,?,?,?)";

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

		/* EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO */

		int count = jt.update(INSERT_EMP, bo.getEmpNo(), bo.getEname(), bo.getJob(), bo.getMgr(), bo.getHireDate(),
				bo.getSalary(), bo.getComm(), bo.getDeptNo());
		return count;
	}

	private class EmpRowMapper implements RowMapper<EmpBO> {

		@Override
		public EmpBO mapRow(ResultSet rs, int rowNum) throws SQLException {

			EmpBO bo = new EmpBO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
					rs.getInt(6), rs.getInt(7), rs.getInt(8));

			return bo;
		}

	}
}
