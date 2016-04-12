package com.greatwideweb.vo;

import org.hibernate.Session;

import com.greatwideweb.util.HibernateUtil;

public class TeamTest {
	
	public void ensureTeamQueryReturnsRow() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		//session.get
		
	}

}
