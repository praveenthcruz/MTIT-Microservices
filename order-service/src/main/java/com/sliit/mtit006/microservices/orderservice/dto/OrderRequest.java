package com.sliit.mtit006.microservices.orderservice.dto;

public class OrderRequest {

	private String OrderType;
	private String OrderDetails;
	private String PaymentDetails;
	private String PaymentType;
	private String Amount;


	public String getPaymentDetails() {
		return PaymentDetails;
	}

	public void setPaymentDetails(String paymentDetails) {
		PaymentDetails = paymentDetails;
	}

	public String getPaymentType() {
		return PaymentType;
	}

	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}

	public String getOrderType() {
		return OrderType;
	}

	public void setOrderType(String orderType) {
		OrderType = orderType;
	}

	public String getOrderDetails() {
		return OrderDetails;
	}

	public void setOrderDetails(String orderDetails) {
		OrderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "OrderRequest{" +
				"OrderType='" + OrderType + '\'' +
				", OrderDetails='" + OrderDetails + '\'' +
				", PaymentDetails='" + PaymentDetails + '\'' +
				", PaymentType='" + PaymentType + '\'' +
				", Amount='" + Amount + '\'' +
				'}';
	}
}
