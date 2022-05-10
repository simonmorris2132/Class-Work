package com.careerdevs.gorestsql.validation;

import java.util.Optional;

import com.careerdevs.gorestsql.models.User;
import com.careerdevs.gorestsql.repos.UserRepository;

public class UserValidation {
    
    public static ValidError validateUser(User user, UserRepository userRepository, boolean isUpdate) {
        ValidError errors = new ValidError();

        System.out.println(user.getId());

        if (isUpdate) {
            if (user.getId() == 0) {
                errors.addError("id", "ID can not be left blank");
            } else {
                Optional<User> foundUser = userRepository.findById((long) user.getId());
                if (foundUser.isEmpty()) {
                    errors.addError("id", "No user found with the ID: " + user.getId());
                }
            }
        }

        String userName = user.getName();
        String userEmail = user.getEmail();
        String userGender = user.getGender();
        String userStatus = user.getStatus();

        if (userName == null || userName.trim().equals("")) {
            errors.addError("name", "Name can not be left blank");
        }

        if (userEmail == null || userEmail.trim().equals("")) {
            errors.addError("email", "Email can not be left blank");
        }

        if (userGender == null || userGender.trim().equals("")) {
            errors.addError("gender", "Gender can not be left blank");
        } else if (!(userGender.equals("male") || userGender.equals("female") || userGender.equals("other"))) {
            errors.addError("gender", "Gender must be: Male, Female, Other");
        }

        if (userStatus == null || userStatus.trim().equals("")) {
            errors.addError("status", "Status can not be left blank");
        } else if (!(userStatus.equals("active") || userStatus.equals("inactive"))) {
            errors.addError("status", "Status must be: Active or Inactive");
        }
        
        return errors;

    }

}
