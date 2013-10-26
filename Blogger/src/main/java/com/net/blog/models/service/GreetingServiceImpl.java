package com.net.blog.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.net.blog.models.Greeting;
import com.net.blog.models.dao.GreetingDAO;

@Service
public class GreetingServiceImpl implements GreetingService{
	
	@Autowired
	private GreetingDAO greetingDAO;

	
	@Transactional
	public void addGreeting(Greeting greeting) {
		greetingDAO.addGreeting(greeting);
	}

	
	@Transactional
	public List<Greeting> listGreeting() {		
		return greetingDAO.listGreeting();
	}

	
	@Transactional
	public void removeGreeting(Integer id) {
		greetingDAO.removeContact(id);
		
	}

}
