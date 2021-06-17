package com.igorpereira.adsjobs.adpters.api.controllers;

import com.igorpereira.adsjobs.adpters.api.controllers.requests.UserRequest;
import com.igorpereira.adsjobs.adpters.api.controllers.responses.UserResponse;
import com.igorpereira.adsjobs.domain.entity.User;
import com.igorpereira.adsjobs.domain.ports.driver.CreateUserPort;
import com.igorpereira.adsjobs.domain.ports.driver.EnableUserByTokenPort;
import com.igorpereira.adsjobs.domain.userstories.CreateUserUS;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/user")
@RestController
@RequiredArgsConstructor
public class UserController {

    private final CreateUserPort createUserPort;
    private final EnableUserByTokenPort enableUserByTokenPort;

    @PostMapping
    public UserResponse post(@RequestBody UserRequest request){
        var user = createUserPort.execute(request.toUser());
        return new UserResponse(user);

    }

    @PatchMapping("check-by")
    public void checkByToken(@RequestParam String token){
        enableUserByTokenPort.execute(token);
    }
    
}
