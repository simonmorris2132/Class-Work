package com.example.testEmailBackend.Registration;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegisController {
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }
}
