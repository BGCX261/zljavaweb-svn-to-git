package com.cuit.spring.Util;

import org.hibernate.SessionFactory;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class SuperDaoSupport extends HibernateDaoSupport{

	/*
	 * 
	 * 
	 
	private HibernateTemplate hibernatetemplate  ;
//	public void setSuperHibernateTemplate(HibernateTemplate hibernateTemplate) {
//		super.setHibernateTemplate(hibernateTemplate);
//	}
	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}
	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		super.setHibernateTemplate(hibernatetemplate);
	}
	*/
	
	private SessionFactory sessionfactory;
	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public void setSessionfactory(SessionFactory sessionfactory) {
		super.setSessionFactory(sessionfactory);
	}
	
	
}
