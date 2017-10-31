package com.myhibernate.configration.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class MyHibernateDao {
	
	@Autowired
	private SessionFactory sf;
	protected Session getSession() {
		return sf.getCurrentSession();
	}
	
	public void persist(Object obj) {
		getSession().persist(obj);
	}
	
	public void delete(Object obj) {
		getSession().delete(obj);
	}
	

}
