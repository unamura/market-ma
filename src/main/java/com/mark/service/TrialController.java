package com.mark.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrialController {

	@GetMapping("/prod")
	public String welcome(Model model) {
		return "product.html";
	}



}
