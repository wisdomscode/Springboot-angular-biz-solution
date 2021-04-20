package servbyte.com.businesshub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import servbyte.com.businesshub.model.City;
import servbyte.com.businesshub.repository.CityRepository;

import java.util.List;

@Service
public class CityService {
    private final CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public City addCity(City city) {
        city.setId(city.getId());
        return cityRepository.save(city);
    }

    public List<City> findAllCities() {
        return cityRepository.findAll();
    }

    public City updateCity(City city) {
        return cityRepository.save(city);
    }
}
