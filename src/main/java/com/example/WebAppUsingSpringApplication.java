package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@ComponentScan({"com.example"})
@Controller
//@EntityScan
//@EnableJpaRepositories
class WebAppUsingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppUsingSpringApplication.class, args);
	}
	
//	@ResponseBody
	@RequestMapping("/")
	String home() {
		return "hello";
	}
	@RequestMapping("/newpersonalloan")
	
	String newLoan() {
		return "personalloan";
	}
	
	
	@RequestMapping("/findLoanDetailsOfUser")
	String LoanCheck() {
		
		return "findLoanDetails";
	}
	
	
	@RequestMapping("/LoanCheck")
	String checkLoanDetails(@RequestParam("firstname") String name,
			@RequestParam("ido		fuser") String id,Model model) {
		model.addAttribute("name",name);
		model.addAttribute("monthsRemaining",48);
		model.addAttribute("amtRemaining",150000);
		model.addAttribute("EMI",6000);
		
		return "LoanDetails";
	}
	
	
	
}
