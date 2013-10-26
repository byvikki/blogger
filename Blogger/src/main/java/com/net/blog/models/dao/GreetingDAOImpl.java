package com.net.blog.models.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.net.blog.models.Greeting;

@Repository
public class GreetingDAOImpl implements GreetingDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addGreeting(Greeting greeting) {
		sessionFactory.getCurrentSession().save(greeting);		
	}

	@Override
	public List<Greeting> listGreeting() {
		return sessionFactory.getCurrentSession().createQuery("from Greeting").list();		
	}

	@Override
	public void removeContact(Integer id) {
		Greeting greeting = (Greeting) sessionFactory.getCurrentSession().load(Greeting.class, id);
		
		if(null != greeting){
			sessionFactory.getCurrentSession().delete(greeting);
		}
		
	}

}
