package com.sliit.mtit006.microservices.orderservice.service;
import com.sliit.mtit006.microservices.orderservice.dto.OrderRequest;
import com.sliit.mtit006.microservices.orderservice.dto.OrderResponse;
import com.sliit.mtit006.microservices.orderservice.dto.PaymentCreationRequest;
import com.sliit.mtit006.microservices.orderservice.dto.PaymentCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class OrderServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public OrderResponse createOrder(OrderRequest orderRequest){

        PaymentCreationRequest paymentCreationRequest = new PaymentCreationRequest();
        paymentCreationRequest.setPaymentDetails(orderRequest.getPaymentDetails());
        paymentCreationRequest.setPaymentType(orderRequest.getPaymentType());
        paymentCreationRequest.setAmount(orderRequest.getAmount());

        ResponseEntity <PaymentCreationResponse> paymentCreationResponseResponseEntity = restTemplate.postForEntity("http://localhost:8080/payment",paymentCreationRequest, PaymentCreationResponse.class);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderId(UUID.randomUUID().toString());
        orderResponse.setPaymentID(paymentCreationResponseResponseEntity.getBody().getPaymentID());
        orderResponse.setMessage("Successfully Created the Order");

        return orderResponse;
    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

}
