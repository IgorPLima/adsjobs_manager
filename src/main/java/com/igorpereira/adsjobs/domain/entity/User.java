package com.igorpereira.adsjobs.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class User {

    private String id;
    private String name;
    private String email;
    private String password;
    private boolean enabled;
}
