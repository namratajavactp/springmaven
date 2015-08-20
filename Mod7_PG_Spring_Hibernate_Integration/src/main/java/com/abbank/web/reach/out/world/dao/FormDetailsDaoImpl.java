package com.abbank.web.reach.out.world.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.abbank.web.reach.out.world.beans.CustInfo;

	@Component
	public class FormDetailsDaoImpl implements FormDetailsDaoI {
	
		@Autowired
		HibernateTemplate hibernateTemplate;
	
		public HibernateTemplate getHibernateTemplate() {
			return hibernateTemplate;
		}
	
		public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
			this.hibernateTemplate = hibernateTemplate;
		}
	
		public void saveFormDetails(CustInfo custInfo) {
			hibernateTemplate.save(custInfo);
		}
	
		public ArrayList<CustInfo> fetchFormDetails(Integer custId) {
			ArrayList<CustInfo> custInfo = (ArrayList<CustInfo>) getHibernateTemplate().find(
					"from CustInfo where custId=?", custId);
			return custInfo;
		}
	
	}
