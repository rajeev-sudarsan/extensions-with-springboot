package sh.cyber.parent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sh.cyber.parent.business.WelcomeMessage;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	private WelcomeMessage welcomeMessage;
	
	  @RequestMapping("/greeting")
	    public String greet() {
	        return welcomeMessage.greet();
	    }

}
