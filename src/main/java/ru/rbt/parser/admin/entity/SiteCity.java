package ru.rbt.parser.admin.entity;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "site_city")
public class SiteCity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer siteCityId;

    @Column(name = "city_id")
    private Integer cityId;

    @Column(name = "site_id")
    private Integer siteId;

}