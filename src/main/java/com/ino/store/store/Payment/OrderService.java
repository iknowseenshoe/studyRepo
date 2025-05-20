package com.ino.store.store.Payment;

import org.springframework.beans.factory.annotation.Autowired;

//@Service
public class OrderService {
    private PaymentService paymentService;

    @Autowired
    public OrderService(PaymentService paymentService){

        this.paymentService = paymentService;
    }

    public void placeOrder(){

        paymentService.processPayment(100);
    }

    public void setPaymentService(PaymentService paymentService) {

        this.paymentService = paymentService;
    }
}
