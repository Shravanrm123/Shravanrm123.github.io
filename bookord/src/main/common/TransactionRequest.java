package com.mylittleworld.bookorderservice.api.common;

import com.mylittleworld.bookorderservice.api.Model.Order;

public class TransactionRequest {
	private Order order;
	private Payment pay;
	public TransactionRequest() {
		
		// TODO Auto-generated constructor stub
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Payment getPay() {
		return pay;
	}
	public void setPay(Payment pay) {
		this.pay = pay;
	}
	

}
