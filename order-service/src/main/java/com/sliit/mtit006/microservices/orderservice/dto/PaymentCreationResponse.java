package com.sliit.mtit006.microservices.orderservice.dto;

public class PaymentCreationResponse {

    private String PaymentID;
    private String Message;

    public String getPaymentID() {
        return PaymentID;
    }

    public void setPaymentID(String paymentID) {
        PaymentID = paymentID;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
