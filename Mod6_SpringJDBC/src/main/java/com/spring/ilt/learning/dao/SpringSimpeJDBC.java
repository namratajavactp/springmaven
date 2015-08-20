package com.spring.ilt.learning.dao;

import java.sql.Types;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

@SuppressWarnings("unchecked")
public class SpringSimpeJDBC {
	private SimpleJdbcCall simpleJdbcCall = null;

	public void setDataSource(DataSource dataSource) {
		System.out.println("datasource"+dataSource);
		System.out.println(" simpleJdbcCall"+simpleJdbcCall);
		this.simpleJdbcCall = new SimpleJdbcCall(dataSource);
		System.out.println(" simpleJdbcCall"+simpleJdbcCall);
	}
/*
	public void call() {
		simpleJdbcCall.withProcedureName("fetchRecords");
		Map<String, Object> out = simpleJdbcCall.execute();
		Set<String> set = out.keySet();
		for (String string : set) {
			List<Map<String, Object>> obj = (List<Map<String, Object>>) out
					.get(string);
			for (Map<String, Object> map : obj) {
				System.out.println(map);
			}
			break;
		}
	} */

	public void callWithParameter() {
		simpleJdbcCall.withProcedureName("read_registerdate");
		Map<String, Object> values = new HashMap<String, Object>();
		values.put("in_id", new Integer(1));
		SqlParameterSource parameterSource = new MapSqlParameterSource(values);
		System.out.println(simpleJdbcCall.execute(parameterSource));
		Map<String, Object> out = simpleJdbcCall.execute(parameterSource);
		System.out.println(out.get("OUT_FIRSTNAME").toString());
	//	System.out.println(out.get("out_last_name").toString());
	//	System.out.println(out.get("out_income").toString());

	}
/*
	public void callWithParameterData() {
		simpleJdbcCall
				.withProcedureName("read_data_from_RegisterDates")
				.withoutProcedureColumnMetaDataAccess()
				.useInParameterNames("")   
				.declareParameters(new SqlParameter("in_id", Types.NUMERIC), //line 1
						new SqlOutParameter("out_first_name", Types.VARCHAR),//line 2
						new SqlOutParameter("out_last_name", Types.VARCHAR),
						new SqlOutParameter("out_income", Types.VARCHAR));
		Map<String, Object> values = new HashMap<String, Object>();
		values.put("in_id", new Integer(1));
		SqlParameterSource parameterSource = new MapSqlParameterSource(values);
		Map<String, Object> out = simpleJdbcCall.execute(parameterSource);
		System.out.println(out.get("out_first_name").toString());
		System.out.println(out.get("out_last_name").toString());
		System.out.println(out.get("out_income").toString());

	}  */
}
