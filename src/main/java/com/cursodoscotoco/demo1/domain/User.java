package com.cursodoscotoco.demo1.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class User {

    @Id
    private String id = UUID.randomUUID().toString();
    private String name;
    private String city;


}
