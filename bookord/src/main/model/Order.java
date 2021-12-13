package com.mylittleworld.bookorderservice.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mylittleworld.bookorderservice.api.Model.Order;
import com.mylittleworld.bookorderservice.api.Service.OrderService;
import com.mylittleworld.bookorderservice.api.common.TransactionRequest;
import com.mylittleworld.bookorderservice.api.common.TransactionResponse;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService service;
	@PostMapping("/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest request)
	{
		return service.saveOrder(request);
	}
}
