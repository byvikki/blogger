package com.net.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import com.net.blog.models.Greeting;
import com.net.blog.models.service.GreetingService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private GreetingService greetingService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("Welcome home! The client locale is {}.", "en-us");
		model.addAttribute("serverTime", "Some time" );
		model.addAttribute("greeting", new Greeting());
		model.addAttribute("greetingList", greetingService.listGreeting());
		return "home";
	}
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public @ResponseBody String showSubmission(@ModelAttribute("greeting") Greeting greeting, BindingResult result){
		
		if(result.hasErrors()){
			return " Some Error on your Input";
		}
		
		greetingService.addGreeting(greeting);
		
		return greeting.getName() +" - - "+ greeting.getMessage();
		
	}
	
}
