package servbyte.com.businesshub;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import servbyte.com.businesshub.model.City;
import servbyte.com.businesshub.repository.CityRepository;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class CityRepositoryTests {
    @Autowired
    private CityRepository repository;

    @Test
    public void testCreateState() {
        City saveCity = repository.save(new City("Lagos"));

        assertThat(saveCity.getId()).isGreaterThan(0);
    }
}
