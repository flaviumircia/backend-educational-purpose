package com.flaviumircia.backendlab4.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

@org.springframework.stereotype.Repository
@EnableJpaRepositories
public interface Repository extends JpaRepository<User,Long> {
    Optional<User> findByStudentName(String studentName);
}
