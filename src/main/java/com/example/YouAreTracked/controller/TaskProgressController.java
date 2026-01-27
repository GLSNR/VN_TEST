package com.example.YouAreTracked.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/taskProgress")
public class TaskProgressController {
	
	@GetMapping("/test1")
	public String testing() {
		return "Hello Vinay....";
	}
	
	@GetMapping("/test2")
	public String testing2() {
		return "Hehhh Hehhh.. you have done the deployment and you gave life to me(api)";
	}
	
	@GetMapping("/test3")
	public String testing3() {
		return "May be not today but one day you can achive your dreams... All the best...!";
	}
	
	@GetMapping("/test4")
	public String testing4() {
		return "don't try to skip a single day";
	}
	
	@GetMapping("/test5")
	public RedirectView redirectToYoutube() {
	    return new RedirectView(
	        "https://youtube.com/shorts/_7uhhKU_N4c?si=5yG1jClVRY1pY98C"
	    );
	}

}
