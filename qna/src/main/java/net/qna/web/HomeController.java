package net.qna.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;

@Controller
public class HomeController {
	//private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String home() {
		//log.debug("logback setting sucess!");
		return "home";
	}
}
