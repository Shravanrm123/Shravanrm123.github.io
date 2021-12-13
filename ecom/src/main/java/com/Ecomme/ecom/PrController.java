package com.Ecomme.ecom;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
//@RequestMapping("/products")
public class PrController {
	//@Autowired
	private ProductService productservice1;
	//@GetMapping("/all")
	public String getAllProducts(Model model)
	{
		model.addAttribute("products",productservice1.getAllProducts());
		return "product_all";
	}

@Autowired
private ProductService productservice;
//@GetMapping("/{productId}")
public String getProductById(Model model, String productId)
{
	model.addAttribute("products",productservice.getProductById(productId));
	return "product";
}
}