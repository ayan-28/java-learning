package com.ayan.ps.api.service;

import com.ayan.ps.api.entity.Payment;
import com.ayan.ps.api.repository.PaymentRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository repository;

	Logger logger = LoggerFactory.getLogger(PaymentService.class);

	public Payment doPayment(Payment payment) throws JsonProcessingException {
		payment.setPaymentStatus(processPayment());
		payment.setTransactionId(UUID.randomUUID().toString());
		logger.info("Payment-Service Request : {}", new ObjectMapper().writeValueAsString(payment));

		return repository.save(payment);
	}

	//Assigning Success and failure at random as a dummy scenario
	public String processPayment() {
		//Any 3rd-party payment gateway --> PayPal, bank transfer, HSBC
		return new Random().nextBoolean() ? "success" : "unsuccessful";
	}
}
