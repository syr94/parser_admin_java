package ru.rbt.parser.admin.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "item_price")
public class ItemPrice {
    @Id
    @Column(name = "item_id")
    private String itemId;

    @Column(name = "price")
    private Float price;

    @Column(name = "parse_state_id")
    private Integer parseStateId;
}