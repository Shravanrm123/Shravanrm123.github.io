package com.Ecomme.ecom;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
		public List<Pr> getAllProducts(){
			List<Pr> listOfProducts=new ArrayList<>();
			listOfProducts.add(new Pr("1","IPhone","Its good",400,"Apple"));
			listOfProducts.add(new Pr("2","Samsung","Amazing",300,"Samsung"));
			listOfProducts.add(new Pr("3","One Plus","Good",300,"One Plus"));
			return listOfProducts;
		}


public Pr getProductById(String id)
{
	Predicate<Pr> byId= p->p.getId().equals(id);
	return filterProducts(byId);
}

public Pr filterProducts(Predicate<Pr> byId)
{
	return getAllProducts().parallelStream().filter(byId).findFirst().orElse(null);
}
}