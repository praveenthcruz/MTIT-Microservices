package com.sliit.mtit006.microservices.paymentservice.paymentservice.dto;

public class PaymentRequest {

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

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "PaymentDetails='" + PaymentDetails + '\'' +
                ", PaymentType='" + PaymentType + '\'' +
                ", Amount='" + Amount + '\'' +
                '}';
    }
}