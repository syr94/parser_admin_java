package ru.rbt.parser.admin.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "item_parameter_value")
public class ItemParameterValue {
    @Id
    @Column(name = "item_parameter_value_id")
    private Integer itemParameterValueId;

    @Column(name = "item_id")
    private Integer itemId;

    @Column(name = "parameter_id")
    private Integer parameterId;

    @Column(name = "actual")
    private String value;
}