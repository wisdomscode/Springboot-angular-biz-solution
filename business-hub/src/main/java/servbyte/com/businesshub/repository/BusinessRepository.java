package servbyte.com.businesshub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import servbyte.com.businesshub.model.Business;

public interface BusinessRepository extends JpaRepository<Business, Long> {
    Business findBusinessById(Long id);
}
