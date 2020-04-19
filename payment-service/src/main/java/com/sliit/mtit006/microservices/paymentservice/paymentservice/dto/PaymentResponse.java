package com.sliit.mtit006.microservices.paymentservice.paymentservice.dto;

    public class PaymentResponse {

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
