package com.Project_Calculator.cloud.resource.price.estimator.Repository;

import com.Project_Calculator.cloud.resource.price.estimator.Model.CloudResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudResourceRepository extends JpaRepository<CloudResource,Long> {
    CloudResource findByNameAndRegionName(String name,String regionName);
}
