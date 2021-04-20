package servbyte.com.businesshub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import servbyte.com.businesshub.model.City;

public interface CityRepository extends JpaRepository<City, Integer> {
}
