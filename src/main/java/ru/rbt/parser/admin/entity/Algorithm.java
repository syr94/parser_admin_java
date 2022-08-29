package ru.rbt.parser.admin.entity;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "algorithm")
public class Algorithm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer algorithmId;

    private String algorithmType;

    private String algorithmClassName;

    private String algorithmDescription;

    @OneToMany(mappedBy = "algorithmId", fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    private List<AlgorithmParameter> parameters;
}
