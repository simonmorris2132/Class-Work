package com.careerdevs.registration.appuser;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface UserRepository {
    
    Optional<AppUser> findByEmail(String email);

}
