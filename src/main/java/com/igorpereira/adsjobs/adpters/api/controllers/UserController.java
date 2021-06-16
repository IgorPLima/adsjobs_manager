package com.igorpereira.adsjobs.adpters.api.controllers;

import com.igorpereira.adsjobs.adpters.api.controllers.requests.UserRequest;
import com.igorpereira.adsjobs.adpters.api.controllers.responses.UserResponse;
import com.igorpereira.adsjobs.domain.entity.User;
import com.igorpereira.adsjobs.domain.ports.driver.CreateUserPort;
import com.igorpereira.adsjobs.domain.userstories.CreateUserUS;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/user")
@RestController
@RequiredArgsConstructor
public class UserController {

    private final CreateUserPort createUserPort;

    @PostMapping
    public UserResponse post(@RequestBody UserRequest request){
        var user = createUserPort.execute(request.toUser());
        return new UserResponse(user);

    }
    
}
