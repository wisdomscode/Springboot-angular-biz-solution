package servbyte.com.businesshub;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import servbyte.com.businesshub.model.Business;
import servbyte.com.businesshub.service.BusinessService;

import java.util.List;

@RestController
@RequestMapping("/business")
public class BusinessResource {
    private final BusinessService businessService;

    public BusinessResource(BusinessService businessService) {
        this.businessService = businessService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Business>> getAllBusiness() {
        List<Business> businesses = businessService.findAllBusinesses();
        return  new ResponseEntity<>(businesses, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Business> getBusinessById(@PathVariable("id") Long id) {
        Business business = businessService.findBusinessById(id);
        return new ResponseEntity<>(business, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Business> addBusiness(@RequestBody Business business) {
        Business newBusiness = businessService.addBusiness(business);
        return  new ResponseEntity<>(newBusiness, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Business> updateBusiness(@RequestBody Business business) {
        Business updateBusiness = businessService.updateBusiness(business);
        return  new ResponseEntity<>(updateBusiness, HttpStatus.OK);
    }

//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> deleteBusiness(@PathVariable("id") Long id) {
//        businessService.deleteBusiness(id);
//        return  new ResponseEntity<>(HttpStatus.OK);
//    }
}
