package com.sliit.mtit006.microservices.paymentservice.paymentservice.controller;


import com.sliit.mtit006.microservices.paymentservice.paymentservice.dto.PaymentRequest;
import com.sliit.mtit006.microservices.paymentservice.paymentservice.dto.PaymentResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @PostMapping(consumes ="application/json",produces ="application/json" )
    public  @ResponseBody PaymentResponse createPayment(@RequestBody PaymentRequest paymentRequest){

        System.out.println("Payment Details: " +paymentRequest);

        PaymentResponse paymentResponse= new PaymentResponse();
        paymentResponse.setPaymentID(UUID.randomUUID().toString());
        paymentResponse.setMessage("Successfully Paid  the Payment");
        return paymentResponse;



    }

}
