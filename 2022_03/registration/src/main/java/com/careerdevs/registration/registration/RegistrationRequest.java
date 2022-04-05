package com.careerdevs.registration.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private String appUserRole;
    private String isAccountNonLocked;
    private String isEnabled;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getAppUserRole() {
        return this.appUserRole;
    }

    public String getIsAccountNonLocked() {
        return this.isAccountNonLocked;
    }

    public String getIsEnabled() {
        return this.isEnabled;
    }

}
