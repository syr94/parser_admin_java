package ru.rbt.parser.admin.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "parsing_date")
public class ParsingDate {
    @Id
    @Column(name = "parsing_id")
    private Integer parsingId;

    @Column(name = "parsing_start_date")
    private Date parsingStartDate;

    @Column(name = "parsing_end_date")
    private Date parsingEndDate;
}