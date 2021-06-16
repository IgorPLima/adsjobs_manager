package com.igorpereira.adsjobs.adpters.api.controllers.responses;

import com.igorpereira.adsjobs.domain.entity.User;
import lombok.Data;


@Data
public class UserResponse {

    private String id;

   public UserResponse(User user){
       this.id = user.getId();
    }
}
