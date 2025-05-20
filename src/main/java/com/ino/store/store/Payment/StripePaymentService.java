package com.ino.store.store.Payment;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

//@Service("stripe")
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private Boolean enabled;

    @Value("${stripe.timeout}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> currencies;

    @Override
    public void processPayment(double amount){
        System.out.println("Stripe");
        System.out.println("API URL: " + apiUrl);
        System.out.println("Enabled: " + enabled);
        System.out.println("Timeout: " + timeout);
        System.out.println("Currencies: " + currencies);
        System.out.println("Amount: " + amount);
    }
}
