package com.igorpereira.adsjobs.domain.ports.driver;

public interface EnableUserByTokenPort {
    void execute(String token);
}
