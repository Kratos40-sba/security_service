package com.loanlander.security_service.application;

import com.loanlander.security_service.user.exception.UserNotFoundException;
import com.loanlander.security_service.user.ripository.UserRipository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRipository userRipository ;

    public UserController(UserRipository userRipository) {
        this.userRipository = userRipository;
    }

    @PostMapping("/validate")
    public String validatTokenAndGetUserName(@RequestHeader("Authorization") String token){
        return userRipository.findById(token).orElseThrow(()->new UserNotFoundException(token)).getUsername() ;
    }

}
