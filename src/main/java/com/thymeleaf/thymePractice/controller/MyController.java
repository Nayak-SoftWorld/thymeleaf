package com.thymeleaf.thymePractice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/about")
	public String about(Model model) {
		System.out.println("This our about handler....!");

		model.addAttribute("name", "Manish Lala");
		model.addAttribute("currentDate", new Date().toLocaleString());

		return "about";
		// about.html
	}

	@GetMapping("/iterate")
	public String iterateHandler(Model m) {

		// create list , set of collection
		List<String> name = List.of("Tom", "Jhon", "Henri", "Peter");

		m.addAttribute("names", name);

		return "iterate";
	}
}
