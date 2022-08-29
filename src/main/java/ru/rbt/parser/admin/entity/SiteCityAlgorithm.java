package ru.rbt.parser.admin.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "catalogue")
public class SiteCityAlgorithm {
    @Id
    @Column(name = "site_city_algorithm_id")
    private Integer url;

    @Column(name = "site_city_id")
    private Integer siteCityId;

    @Column(name = "algorithm_id")
    private Integer algorithmId;
}