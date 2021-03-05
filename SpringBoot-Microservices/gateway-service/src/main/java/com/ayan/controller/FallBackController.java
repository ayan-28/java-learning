package com.ayan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallBackController {

    @RequestMapping("/orderFallback")
    public Mono<String> orderFallback() {
        return Mono.just("Order service is taking long time or it's down");
    }

    @RequestMapping("/paymentFallback")
    public Mono<String> paymentFallback() {
        return Mono.just("Payment service is taking long time or it's down");
    }
}
