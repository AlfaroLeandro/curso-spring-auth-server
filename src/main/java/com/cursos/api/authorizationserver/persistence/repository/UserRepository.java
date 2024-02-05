package com.cursos.api.authorizationserver.persistence.repository;

import com.cursos.api.authorizationserver.persistence.entity.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    public Optional<User> findByUsername(String username);
}
