package servbyte.com.businesshub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import servbyte.com.businesshub.model.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {

}
