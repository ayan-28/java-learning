package com.ayan.os.service;

import com.ayan.os.entity.Order;
import com.ayan.os.repository.OrderRepository;
import com.ayan.os.transaction.Payment;
import com.ayan.os.transaction.TransactionRequest;
import com.ayan.os.transaction.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sun.applet.resources.MsgAppletViewer_es;

@Service
public class OrderService {

    @Autowired
    OrderRepository repository;

    @Autowired
    @Lazy
    private RestTemplate restTemplate;

    @Value("${payment-services.url}")
    String PAYMENT_URL;

    public TransactionResponse saveOrder(TransactionRequest request) {

        Order order = request.getOrder();
        Payment payment = request.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());

        //Calling 3rd-party service using REST Template
        Payment paymentResponse = restTemplate.postForObject(PAYMENT_URL, payment, Payment.class);

        repository.save(order);

        //Build the response
        TransactionResponse response = new TransactionResponse();
        response.setOrder(order);
        response.setAmount(paymentResponse.getAmount());
        response.setMessage(paymentResponse.getPaymentStatus());
        response.setTransactionId(paymentResponse.getTransactionId());

        return response;
    }
}
