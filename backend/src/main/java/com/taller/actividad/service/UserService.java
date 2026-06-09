package com.taller.actividad.service;

import com.taller.actividad.dto.RegisterRequest;
import com.taller.actividad.dto.UserDataResponse;
import com.taller.actividad.entity.UserEntity;
import com.taller.actividad.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDataResponse crearUsuario(RegisterRequest request) {
        if (userRepository.existsByEmail(request.email())) {
            throw new RuntimeException("El correo ya se encuentra registrado.");
        }

        UserEntity nuevoUsuario = new UserEntity();

        nuevoUsuario.setEmail(request.email());
        nuevoUsuario.setPassword(request.password());
        nuevoUsuario.setName(request.name());
        nuevoUsuario.setLastName(request.lastName());
        nuevoUsuario.setAge(request.age());

        userRepository.save(nuevoUsuario);

        return mapToUserDataResponse(nuevoUsuario);
    }

    private UserDataResponse mapToUserDataResponse(UserEntity entity) {
        return UserDataResponse.builder()
                .name(entity.getName())
                .lastName(entity.getLastName())
                .email(entity.getEmail())
                .age(entity.getAge())
                .build();
    }
}
