package com.Project_Calculator.cloud.resource.price.estimator.Controller;




import com.Project_Calculator.cloud.resource.price.estimator.Model.Estimate;
import com.Project_Calculator.cloud.resource.price.estimator.Model.UserData;
import com.Project_Calculator.cloud.resource.price.estimator.Service.CloudResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class CloudPriceController {

    @Autowired
    private CloudResourceService service;

    @PostMapping("/price_calculation")
    public Map<String,Object> priceEstimation(@RequestBody List<UserData> data){
        Map<String,Object> map = new HashMap<>();
        List<Estimate> res = new ArrayList<>();
        int total_cost = 0;
        for(UserData ud:data){
            System.out.println(ud);
            if(ud.getResource()!=null){
                int price = service.price_calculator(ud.getResource(),ud.getRegion());
                int cost = price*ud.getUnit();
                total_cost+=cost;
                Estimate est = new Estimate(ud.getResource(),ud.getRegion(),ud.getUnit(),price,cost);
                res.add(est);
            }
            map.put("cost",total_cost);
            map.put("array",res);

        }

        System.out.println(map.toString());
        return map;

    }












}
