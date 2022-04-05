package com.careerdevs.registration.registration;

import java.util.function.Predicate;

public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(String arg0) {
        // TODO: Regex to validate email
        return true;
    }
    
}
