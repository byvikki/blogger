package com.net.blog.models.dao;

import com.net.blog.models.Greeting;
import java.util.List;
public interface GreetingDAO {
	
	public void addGreeting(Greeting greeting);
	
	public List<Greeting> listGreeting();
	
	public void removeContact(Integer id);

}
