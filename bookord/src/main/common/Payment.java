package com.mylittleworld.bookorderservice.api.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Payment {
	private int payId;
	private String transactionId;
	private int orderid;
	private double amount;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
   public Payment()
	{
		
	}
   
	/*public Payment(int payId, String transactionId, int orderid, double amount, String paymentStatus) {
		super();
		this.payId = payId;
		this.transactionId = transactionId;
		this.orderid = orderid;
		this.amount = amount;
		this.paymentStatus = paymentStatus;
	}
	*/
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	
	
	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	private String paymentStatus;


}
