package servbyte.com.businesshub;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import servbyte.com.businesshub.model.City;
import servbyte.com.businesshub.service.CityService;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityResource {
    private  final CityService cityService;

    public CityResource(CityService cityService ) {
        this.cityService = cityService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<City>> getAllCity() {
        List<City> cities = cityService.findAllCities();
        return  new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<City> addCity(@RequestBody City city) {
        City newCity = cityService.addCity(city);
        return  new ResponseEntity<>(newCity, HttpStatus.CREATED);
    }
}
