package com.example.security.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserInformation,Integer> {

    @Query(value = "select * from userinformation where email=?1 ", nativeQuery = true)
    Optional<UserInformation> findbyemail(String email);
}
