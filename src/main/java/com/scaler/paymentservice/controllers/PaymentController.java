package com.scaler.paymentservice.controllers;

import com.razorpay.RazorpayException;
import com.scaler.paymentservice.dtos.GeneratePaymentLinkDto;
import com.scaler.paymentservice.services.PaymentService;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;
    public PaymentController(@Qualifier("stripePaymentGateway") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping()
    public String generatePaymentLink(@RequestBody GeneratePaymentLinkDto generatePaymentLinkDto) throws RazorpayException, StripeException {
        return paymentService.generatePaymentLink(generatePaymentLinkDto.getId());
    }

    @GetMapping("/isworking")
    public String Demo()
    {
        return "its working";
    }
}
