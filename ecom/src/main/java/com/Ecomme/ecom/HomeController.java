package com.Ecomme.ecom;



import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	public String showHomePage()
	{
		System.out.println("Home Page");
		return "home";
	}
		
}