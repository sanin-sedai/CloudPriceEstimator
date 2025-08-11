package com.Project_Calculator.cloud.resource.price.estimator.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        uniqueConstraints = @UniqueConstraint(columnNames = {"name","region_id"})
)
public class CloudResource {
    @Id
    private long id;
    private String name;
    private int cost;

    @ManyToOne
    @JoinColumn
    private Region region;
}
