package com.net.blog.models.service;


import java.util.List;
import com.net.blog.models.Greeting;

public interface GreetingService {
	
	public void addGreeting(Greeting greeting);
	
	public List<Greeting> listGreeting();
	
	public void removeGreeting(Integer id);

}
