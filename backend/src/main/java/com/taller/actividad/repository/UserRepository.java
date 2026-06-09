package com.taller.actividad.repository;

import com.taller.actividad.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    boolean existsByEmail(String email);

    @Query(value = "SELECT * FROM usuarios WHERE email = :email AND password = :password", nativeQuery = true)
    Optional<UserEntity> validateCredential(@Param("email") String email, @Param("password") String password);
}
