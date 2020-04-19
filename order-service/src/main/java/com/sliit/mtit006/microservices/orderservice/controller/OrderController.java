package com.sliit.mtit006.microservices.orderservice.controller;

import java.util.UUID;
import com.sliit.mtit006.microservices.orderservice.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sliit.mtit006.microservices.orderservice.dto.OrderRequest;
import com.sliit.mtit006.microservices.orderservice.dto.OrderResponse;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderServiceImpl orderService;

	@PostMapping(consumes ="application/json",produces ="application/json" )
	public @ResponseBody OrderResponse createOrder(@RequestBody OrderRequest request) {
		
		
		System.out.println("Order Details: " +request);
		return orderService.createOrder(request);
		
	}

}
