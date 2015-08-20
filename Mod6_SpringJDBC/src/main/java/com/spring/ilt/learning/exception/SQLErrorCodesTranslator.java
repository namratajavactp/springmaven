package com.spring.ilt.learning.exception;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DeadlockLoserDataAccessException;
import org.springframework.jdbc.support.SQLExceptionSubclassTranslator;

public class SQLErrorCodesTranslator  extends SQLExceptionSubclassTranslator{

	 protected DataAccessException customTranslate(String task, String sql, SQLException sqlException) {
	        if (sqlException.getErrorCode() == -9878) {
	            return new DeadlockLoserDataAccessException(task, sqlException);
	        }
	        return null;
	    }
	 
}


