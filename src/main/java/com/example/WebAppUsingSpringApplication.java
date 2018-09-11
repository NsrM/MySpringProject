package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class WebAppUsingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppUsingSpringApplication.class, args);
	}
	
//	@ResponseBody
	@RequestMapping("/")
	String home() {
		return "hello";
	}
}
