package com.example.security.Authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    @Autowired
    AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @ModelAttribute RegisterRequest registerRequest
    ){

        return ResponseEntity.ok(authService.register(registerRequest));
    }

    @PostMapping("/Authenticate")
    public ResponseEntity<AuthenticationResponse>auth(
            @ModelAttribute AuthenticationRequest authenticationRequest
    ){
        return ResponseEntity.ok(authService.authenticate(authenticationRequest));
    }
}
