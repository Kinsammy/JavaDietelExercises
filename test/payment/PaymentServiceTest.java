package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import revisionWithChief.payment.FlutterwaveService;
import revisionWithChief.payment.PaymentService;
import revisionWithChief.payment.PaystackService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentServiceTest {
    private PaymentService paymentService;

    @BeforeEach
    public void setUp(){
        paymentService = new PaystackService();
    }

    @Test
    public void pay(){
        paymentService = new FlutterwaveService();
        paymentService.processPayment(690.0);
    }
}
