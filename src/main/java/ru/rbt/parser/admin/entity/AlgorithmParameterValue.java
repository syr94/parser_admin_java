package ru.rbt.parser.admin.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "algorithm_parameter_value")
public class AlgorithmParameterValue {
    @Id
    @Column(name = "algorithm_parameter_value_id")
    private Integer algorithmParameterValueId;

    @Column(name = "site_city_id")
    private Integer siteCityId;

    @Column(name = "algorithm_parameter_id")
    private Integer algorithmParameterId;

    @Column(name = "parameter_value")
    private String parameterValue;
}