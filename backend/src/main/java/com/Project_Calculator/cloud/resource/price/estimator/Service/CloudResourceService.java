package com.Project_Calculator.cloud.resource.price.estimator.Service;

import com.Project_Calculator.cloud.resource.price.estimator.Model.CloudResource;
import com.Project_Calculator.cloud.resource.price.estimator.Repository.CloudResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CloudResourceService {
    @Autowired
    public CloudResourceRepository repo;

    public int price_calculator(String name, String regionName){
        CloudResource cld = repo.findByNameAndRegionName(name,regionName);
        return cld.getCost();
    }


}
