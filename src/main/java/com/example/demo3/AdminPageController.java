package com.example.demo3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPageController {
	@GetMapping("/adminpage")
	public String adminPage() {
		return "adminPage";
	}

}
