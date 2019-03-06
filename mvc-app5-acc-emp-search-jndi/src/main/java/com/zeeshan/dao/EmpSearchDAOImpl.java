package com.zeeshan.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.zeeshan.bo.SearchBO;
import com.zeeshan.bo.SearchResultBO;

import lombok.Data;

@Data
public class EmpSearchDAOImpl implements EmpSearchDAO {

	private static Logger logger = Logger.getLogger(EmpSearchDAOImpl.class.getName());

	private static final String EMP_SEARCH_QUERY = "SELECT EMPNO, ENAME, JOB, SAL, DEPTNO, MGR FROM EMP "
			+ "WHERE(EMPNO IS NOT NULL AND EMPNO=?)" + "OR (ENAME IS NOT NULL AND ENAME=?)"
			+ "OR (JOB IS NOT NULL AND JOB LIKE ?)" + "OR (SAL IS NOT NULL AND SAL=?)";

	private JdbcTemplate jt;

	@Override
	public List<SearchResultBO> search(SearchBO sbo) {
		logger.info("DAO class search(-) invoked");
		List<SearchResultBO> listBO = jt.query(EMP_SEARCH_QUERY, new EmpRowMapper(), sbo.getNo(), sbo.getName(),
				sbo.getDesg(), sbo.getSalary());
		return listBO;
	}

	private static final class EmpRowMapper implements RowMapper<SearchResultBO> {

		@Override
		public SearchResultBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			logger.info("DAO class mapRow(-) invoked");
			SearchResultBO searchBO = new SearchResultBO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
					rs.getInt(5), rs.getInt(6));

			return searchBO;
		}

	}
}
