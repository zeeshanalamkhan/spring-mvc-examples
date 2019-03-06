package com.zeeshan.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.zeeshan.bo.EmpBO;

import lombok.Data;

@Data
public class EmpDAOImpl implements EmpDAO {

	private static final String GET_ALL_EMP_DETAILS = "SELECT EMPNO, ENAME, JOB, SAL FROM EMP";

	private JdbcTemplate jt;

	/*public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}*/

	@Override
	public List<EmpBO> retrieveAllEmps() {
		List<EmpBO> listBO = (List<EmpBO>) jt.query(GET_ALL_EMP_DETAILS, new EmpRowMapper());
		return listBO;
	}

	private class EmpRowMapper implements RowMapper<EmpBO> {

		@Override
		public EmpBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmpBO bo = new EmpBO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
			return bo;
		}

	}
}
