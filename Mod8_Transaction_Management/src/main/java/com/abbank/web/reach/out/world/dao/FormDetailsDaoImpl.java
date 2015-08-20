package com.abbank.web.reach.out.world.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.abbank.web.reach.out.world.beans.CustInfo;

public class FormDetailsDaoImpl implements FormDetailsDaoI {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	public void saveFormDetails(CustInfo custInfo) {
		hibernateTemplate.save(custInfo);
	}

}
