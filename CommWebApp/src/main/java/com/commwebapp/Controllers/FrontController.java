package com.commwebapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {

	//@RequestMapping(value="/" , method=RequestMethod.GET)
	@GetMapping("/")
	public String rootView() {
		
		return "home";
	}
	
}
