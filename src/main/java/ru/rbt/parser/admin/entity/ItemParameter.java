package ru.rbt.parser.admin.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "item_parameter")
public class ItemParameter {
    @Id
    @Column(name = "parameter_id")
    private Integer parameterId;

    @Column(name = "parameter_name")
    private String algorithmType;

    @Column(name = "parameter_description")
    private String algorithmClassName;
}