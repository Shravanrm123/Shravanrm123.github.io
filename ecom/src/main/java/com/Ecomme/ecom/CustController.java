package com.Ecomme.ecom;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class CustController {
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String viewCustomerPage(Model model)
	{
		model.addAttribute("myCustomer",new Customer());
		return "register";
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView viewCustomerPage(@ModelAttribute("mycustomer") Customer customer)
	{
		System.out.println(customer.toString());
		ModelAndView mv=new ModelAndView("status");
		mv.addObject("status","Customer Created" + Math.random());
		return mv;
	}

}

