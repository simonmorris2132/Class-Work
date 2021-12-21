package com.example.testEmailBackend.AppUser;

import java.util.Optional;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface AppUserRepo {
    Optional<AppUser> findByEmail(String email);    
}
