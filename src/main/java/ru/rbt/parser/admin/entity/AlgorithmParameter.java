package ru.rbt.parser.admin.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "algorithm_parameter")
public class AlgorithmParameter {
    @Id
    @Column(name = "algorithm_parameter_id")
    private Integer algorithmParameterId;

    @Column(name = "parameter_name")
    private String parameterName;

    @Column(name = "algorithm_id")
    private String algorithmId;

    @Column(name = "necessarily")
    private Integer necessarily;
}