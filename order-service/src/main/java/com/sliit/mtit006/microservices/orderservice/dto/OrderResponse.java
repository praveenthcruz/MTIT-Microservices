package com.sliit.mtit006.microservices.orderservice.dto;

public class OrderResponse {
	
	private String OrderId;
	private String Message;
	private String PaymentID;


	public String getOrderId() {
		return OrderId;
	}

	public void setOrderId(String orderId) {
		OrderId = orderId;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public String getPaymentID() {
		return PaymentID;
	}

	public void setPaymentID(String paymentID) {
		PaymentID = paymentID;
	}
}
