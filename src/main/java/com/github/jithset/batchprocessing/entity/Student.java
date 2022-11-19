package com.github.jithset.batchprocessing.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @Column(name = "CUSTOMER_ID")
    private int id;
    @Column(name = "ROLL_NUMBER")
    private String roll_number;
    @Column(name = "NAME")
    private String name;
}
