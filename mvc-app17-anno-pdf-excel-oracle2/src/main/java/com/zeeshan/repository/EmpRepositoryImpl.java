package com.zeeshan.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zeeshan.bo.EmpBO;

import lombok.Data;

@Data
@Repository("repository")
public class EmpRepositoryImpl implements EmpRepository {

	private static final String GET_ALL_EMPS = "SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO FROM EMP";
	
	@Autowired
	private JdbcTemplate jt;

	@Override
	public List<EmpBO> listAllEmp() {

		List<EmpBO> listBO = jt.query(GET_ALL_EMPS, new EmpRowMapper());
		return listBO;
	}

	private static class EmpRowMapper implements RowMapper<EmpBO> {

		@Override
		public EmpBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmpBO bo = new EmpBO();
			bo.setEmpNo(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setMgr(rs.getInt(4));
			bo.setHireDate(rs.getDate(5));
			bo.setSal(rs.getInt(6));
			bo.setComm(rs.getInt(7));
			bo.setDeptNo(rs.getInt(8));
			return bo;
		}

	}
}
