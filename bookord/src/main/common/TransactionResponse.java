package com.mylittleworld.bookorderservice.api.common;

import com.mylittleworld.bookorderservice.api.Model.Order;

public class TransactionResponse {
	private Order order;
	public TransactionResponse()
	{
		
	}
	public TransactionResponse(Order order, double amount, String message, String transactionid) {
		super();
		this.order = order;
		this.amount = amount;
		this.message = message;
		this.transactionid = transactionid;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}
	private double amount;
	private String message;
	private String transactionid;
	

}
