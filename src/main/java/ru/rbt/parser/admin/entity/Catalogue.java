package ru.rbt.parser.admin.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "catalogue")
public class Catalogue {
    @Id
    @Column(name = "url")
    private String url;

    @Column(name = "name")
    private String name;

    @Column(name = "site_city_id")
    private Integer siteCityId;

    @Column(name = "actual")
    private Integer actual;
}