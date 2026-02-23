package com.practice.security.controller;

import com.practice.security.dto.CreateUserRequestDto;
import com.practice.security.model.User;
import com.practice.security.service.UserDetailsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/v1/public")
@RequiredArgsConstructor
public class UserController {

    private final UserDetailsServiceImpl userDetailsService;

    @PostMapping("/sign-up")
    public ResponseEntity<User> saveUserDetails(@RequestBody CreateUserRequestDto userRequestDto){

        return ResponseEntity.ok(userDetailsService.saveUser(userRequestDto));
    }
}
