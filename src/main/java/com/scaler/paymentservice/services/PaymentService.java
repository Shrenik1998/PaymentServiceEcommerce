package com.scaler.paymentservice.services;

import com.razorpay.RazorpayException;
import com.scaler.paymentservice.dtos.GeneratePaymentLinkDto;
import com.stripe.exception.StripeException;

public interface PaymentService {
    String generatePaymentLink(Long orderId) throws RazorpayException, StripeException;
}
