package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

	@GetMapping("/csi")
	public String sayWelcome()
	{
		return "WELCOME TO FINTECH CSI PUNE";
	}
}
