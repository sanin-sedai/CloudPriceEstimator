package com.Project_Calculator.cloud.resource.price.estimator.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData {
    private String resource;
    private String region;
    private int unit;
}
