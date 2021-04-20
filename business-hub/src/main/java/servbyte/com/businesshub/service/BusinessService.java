package servbyte.com.businesshub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import servbyte.com.businesshub.model.Business;
import servbyte.com.businesshub.repository.BusinessRepository;

import java.util.List;

@Service
public class BusinessService {
    private final BusinessRepository businessRepository;

    @Autowired
    public BusinessService(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    public Business addBusiness(Business business) {
        business.setId(business.getId());
        return businessRepository.save(business);
    }

    public List<Business> findAllBusinesses() {
        return businessRepository.findAll();
    }

    public Business updateBusiness(Business business) {
        return businessRepository.save(business);
    }

    public Business findBusinessById(Long id) {
        return businessRepository.findBusinessById(id);
    }
}
