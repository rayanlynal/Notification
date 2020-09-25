package com.amazonsns.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Topic {

    @Id
    private Integer id;

    private String name;

}

