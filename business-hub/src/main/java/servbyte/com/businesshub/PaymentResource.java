package servbyte.com.businesshub;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import servbyte.com.businesshub.model.Business;
import servbyte.com.businesshub.model.Payment;
import servbyte.com.businesshub.service.PaymentService;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentResource {
    private final PaymentService paymentService;

    public PaymentResource(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Payment>> getAllPayments() {
        List<Payment> payments = paymentService.findAllPayments();
        return  new ResponseEntity<>(payments, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Payment> addPayment(@RequestBody Payment payment) {
        Payment newPayment = paymentService.addPayment(payment);
        return  new ResponseEntity<>(newPayment, HttpStatus.CREATED);
    }
}
