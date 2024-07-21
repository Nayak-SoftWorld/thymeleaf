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

	// Condition Handler
	@GetMapping("/condition")
	public String conditionHandler(Model m) {

		System.out.println("Contional handler Executed !");

		m.addAttribute("isActive", 1);
		m.addAttribute("gender", "F");

		List<Integer> listt = List.of(1, 2, 3, 4, 5);
		m.addAttribute("myList", listt);

		return "condition";
	}
}
