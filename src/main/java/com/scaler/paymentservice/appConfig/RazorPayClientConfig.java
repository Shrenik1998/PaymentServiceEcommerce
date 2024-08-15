package com.scaler.paymentservice.appConfig;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorPayClientConfig {

    @Bean
    public RazorpayClient RazorPayClientConfig() throws RazorpayException {
        return new RazorpayClient("key_id", "key_secret");
    }
}
