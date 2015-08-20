package com.abbank.web.reach.out.world.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.abbank.web.reach.out.world.beans.CustInfo;

public class FormDetailsSessionFactoryDaoImpl {
	
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void saveFormDetails(CustInfo custInfo) {
		getCurrentSession().save(custInfo);
	}
	
	public CustInfo fetchFormDetails(Integer custId) {
		CustInfo custInfo = (CustInfo) getCurrentSession().get(CustInfo.class, custId);
		return custInfo;
	}
}
