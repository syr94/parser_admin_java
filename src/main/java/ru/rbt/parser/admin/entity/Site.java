package ru.rbt.parser.admin.entity;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "site")
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer siteId;

    private String name;

    private String mainPageUrl;

    private Integer parseId;

    @ManyToMany
    @JoinTable(
            name = "site_city",
            joinColumns = {@JoinColumn(name = "site_id")},
            inverseJoinColumns = {@JoinColumn(name = "city_id")}
    )
    private List<City> cities;
}