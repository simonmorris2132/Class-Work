package com.careerdevs.registration.registration;

import com.careerdevs.registration.appuser.AppUser;
import com.careerdevs.registration.appuser.AppUserService;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RegistrationService {

    private AppUserService appUserService;
    private EmailValidator emailValidator;

    public String register(RegistrationRequest request) {
        
        boolean isValidEmail = emailValidator.test(request.getEmail());

        if (!isValidEmail) {
            throw new IllegalStateException("Email not valid");
        }
        return appUserService.signUpUser(new AppUser(request.getFirstName(), request.getLastName(), request.getUsername(), request.getEmail(), request.getPassword(), appUserRole, request.isAccountNonLocked(), request.isEnabled());
    }
    
}
