package com.ayan.os.controller;

import com.ayan.os.entity.Order;
import com.ayan.os.service.OrderService;
import com.ayan.os.transaction.TransactionRequest;
import com.ayan.os.transaction.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService service;

    @PostMapping("/saveOrder")
    public TransactionResponse saveOrder(@RequestBody TransactionRequest request) {
        return service.saveOrder(request);
    }
}
