package com.mylittleworld.bookorderservice.api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mylittleworld.bookorderservice.api.Model.Order;
import com.mylittleworld.bookorderservice.api.Repo.OrderRepo;
import com.mylittleworld.bookorderservice.api.common.Payment;
import com.mylittleworld.bookorderservice.api.common.TransactionRequest;
import com.mylittleworld.bookorderservice.api.common.TransactionResponse;



@Service
public class OrderService
{
	@Autowired
	private RestTemplate template;
	@Autowired
	OrderRepo repo;
	public TransactionResponse saveOrder(TransactionRequest request)
	{
		String response="";
		Order order = request.getOrder();
		Payment pay=request.getPay();
		pay.setOrderid(order.getId());
		pay.setAmount(order.getPrice());
		
		//restcall
		Payment payR = template.postForObject("http://payment/payment/doPayment",pay,Payment.class);
		response=payR.getPaymentStatus().equals("Success")?"payment proccessing success & order placed":"Failed in payment api & order is added to cart";
		repo.save(order);
		
		return new TransactionResponse(order,payR.getAmount(),payR.getTransactionId(),response);
		
	}

	
	
}
