package com.igorpereira.adsjobs.domain.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Token {

    private String value;
    private LocalDateTime expiredAt;

    public Token(){
        this.expiredAt = LocalDateTime.now().plusDays(2);
    }

    public boolean hasExpired(){
        return expiredAt.isBefore(LocalDateTime.now());
    }
}
