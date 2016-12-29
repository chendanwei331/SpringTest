package com.cn.test.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cn.test.bo.AAA;

@Repository
public class AaaDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session currentSession(){
		return sessionFactory.openSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<AAA> findAll(){
		return (List<AAA>)currentSession().createCriteria(AAA.class).list();
	}
	
}
