package servbyte.com.businesshub.service;

import org.springframework.stereotype.Service;
import servbyte.com.businesshub.model.Business;
import servbyte.com.businesshub.model.Payment;
import servbyte.com.businesshub.repository.PaymentRepo;

import java.util.List;
import java.util.UUID;

@Service
public class PaymentService {
    private final PaymentRepo paymentRepo;

    public PaymentService(PaymentRepo paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

    public Payment addPayment(Payment payment) {
        payment.setTransaction_ref(UUID.randomUUID().toString());
        return paymentRepo.save(payment);
    }

    public List<Payment> findAllPayments() {
        return paymentRepo.findAll();
    }
}
