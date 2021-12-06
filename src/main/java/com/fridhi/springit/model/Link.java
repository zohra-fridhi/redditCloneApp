package com.fridhi.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
@NoArgsConstructor
public class Link {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String url;

}
