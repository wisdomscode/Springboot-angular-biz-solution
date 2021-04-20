package servbyte.com.businesshub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import servbyte.com.businesshub.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
    Menu findMenuById(Integer id);
}
