package com.igorpereira.adsjobs.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private String id;

    private String name;

    private String email;

    private String password;

    private boolean enable;
}
