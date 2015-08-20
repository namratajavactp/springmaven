package com.spring.ilt.learning.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.spring.ilt.learning.beans.EnrollRequest;

public class SpringJDBCNamedParameterDAO {

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void namedParameter() {
		//Line 1
		String sql = "SELECT * FROM RegisterDate where id = :id or firstName =:name";
		
		//Line 2
		Map<String, Object> values = new HashMap<String, Object>();
		values.put("id", new Integer(5));
		values.put("name", "Master");

		//Line 3
		SqlParameterSource parameterSource = new MapSqlParameterSource(values);
		
		//Line 4
		List<EnrollRequest> list = namedParameterJdbcTemplate.query(sql,
				parameterSource, new RowMappers());
		//Line 5
		for (EnrollRequest enrollRequest : list) {

			System.out.println(enrollRequest.getId() + "\t"
					+ enrollRequest.getFirstname() + "\t"
					+ enrollRequest.getLastname() + "\t"
					+ enrollRequest.getIncome());
		}

	}
	
	public void namedParameter(EnrollRequest enrollRequestParam) {
		//Line 1
		String sql = "SELECT * FROM RegisterDate where id = :id or firstName =:firstname";
		
		//Line 2
		SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(enrollRequestParam);
		
		//Line 3
		List<EnrollRequest> list = namedParameterJdbcTemplate.query(sql,
				parameterSource, new RowMappers());
		//Line 4
		for (EnrollRequest enrollRequest : list) {

			System.out.println(enrollRequest.getId() + "\t"
					+ enrollRequest.getFirstname() + "\t"
					+ enrollRequest.getLastname() + "\t"
					+ enrollRequest.getIncome());
		}

	}

	class RowMappers implements RowMapper<EnrollRequest> {

		public EnrollRequest mapRow(ResultSet rs, int rowNumber)
				throws SQLException {
			EnrollRequest enrollRequest = new EnrollRequest();
			enrollRequest.setId(rs.getInt(1));
			enrollRequest.setFirstname(rs.getString(2));
			enrollRequest.setLastname(rs.getString(3));
			enrollRequest.setIncome(rs.getInt(4));
			return enrollRequest;
		}

	}

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	public void setDataSource(
			DataSource dataSource) {
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

}
