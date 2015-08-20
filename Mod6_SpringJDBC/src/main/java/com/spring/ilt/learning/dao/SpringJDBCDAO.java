package com.spring.ilt.learning.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.ilt.learning.beans.EnrollRequest;
import com.spring.ilt.learning.exception.SQLErrorCodesTranslator;

public class SpringJDBCDAO {

	private JdbcTemplate jdbcTemplate;

	public int queryForInt() {
		
		String sql = "SELECT count(*) FROM RegisterDate";
		int count = jdbcTemplate.queryForInt(sql);
		return count;
	}

	public void queryForList() {
		// Line 1
		String sql = "SELECT * FROM RegisterDate";
		// Line 2
		List<Map<String, Object>> objectList = jdbcTemplate.queryForList(sql);
		// Line 3
		for (Map<String, Object> map : objectList) {
			String data = "====>>>>> ";
			// Line 4
			for (String str : map.keySet()) {
				data += "\t Key :: " + str + " \t  value :: " + map.get(str);
			}
			// Line 5
			System.out.println(data);
		}
	}

	public void queryWithRowMapper() {
		// Line 1
		String sql = "SELECT * FROM RegisterDate";
		// Line 2
		List<EnrollRequest> objectList = jdbcTemplate.query(sql,
				new RowMappers());
		// Line 3
		for (EnrollRequest enrollRequest : objectList) {
			System.out.println(enrollRequest.getId() + "\t"
					+ enrollRequest.getFirstname() + "\t"
					+ enrollRequest.getLastname() + "\t"
					+ enrollRequest.getIncome());
		}
	}

	public void queryWithWhereClause() {
		// Line 1
		String sql = "SELECT * FROM RegisterDate where id = ?";
		// Line 2
		List<EnrollRequest> objectList = jdbcTemplate.query(sql,
				new Object[] { new Integer(1) }, new RowMappers());
		// Line 3
		for (EnrollRequest enrollRequest : objectList) {

			System.out.println(enrollRequest.getId() + "\t"
					+ enrollRequest.getFirstname() + "\t"
					+ enrollRequest.getLastname() + "\t"
					+ enrollRequest.getIncome());
		}
	}
	
	public void queryForObject() {
		// Line 1
		String sql = "SELECT firstname FROM RegisterDate where id = ?";
		// Line 2
		String firstName = jdbcTemplate.queryForObject(sql,new Object[]{new Integer(1)} ,String.class);
		// Line 3
		System.out.println("=====>>> firstName :: " + firstName);
	}
	
	public void UpdatingForInserting() {
		// Line 1
		String sql = "insert into RegisterDate(id,firstname,lastname,income) values(?,?,?,?)";
		// Line 2
		int count = jdbcTemplate.update(sql, new Integer(5),"Master","YODHA",new Integer(500000));
		// Line 3
		System.out.println("=====>>> count :: " + count);
	}

	public void UpdateForUpdating() {
		// Line 1
		String sql = "update RegisterDate set income=? where id = ? ";
		// Line 2
		int count = jdbcTemplate.update(sql, new Integer(900000),new Integer(5));
		// Line 3
		System.out.println("=====>>> count :: " + count);
	}
	
	
	public void UpdateForDelete() {
		// Line 1
		String sql = "delete from RegisterDate where id = ? ";
		// Line 2
		int count = jdbcTemplate.update(sql,new Integer(5));
		// Line 3
		System.out.println("=====>>> count :: " + count);
	}
	
	public void execute() {
		 jdbcTemplate.execute("create table table_name (id integer, firstName varchar(50))");
	}
	
	public void coustomExceptionHandler() {
		// Line 1
		String sql = "SELECT * FROM RegisterDate";
		// Line 2
		SQLErrorCodesTranslator codesTranslator = new SQLErrorCodesTranslator();
		// Line 3
		jdbcTemplate.setExceptionTranslator(codesTranslator);
		// Line 4
		List<Map<String, Object>> objectList = jdbcTemplate.queryForList(sql);
		// Line 5
		for (Map<String, Object> map : objectList) {
			String data = "====>>>>> ";
			// Line 5
			for (String str : map.keySet()) {
				data += "\t Key :: " + str + " \t  value :: " + map.get(str);
			}
			// Line 6
			System.out.println(data);
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

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
