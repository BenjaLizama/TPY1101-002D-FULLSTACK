package com.taller.actividad.controller;

import com.taller.actividad.dto.RegisterRequest;
import com.taller.actividad.dto.UserDataResponse;
import com.taller.actividad.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/usuarios")
@CrossOrigin("*")
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDataResponse> agregarUsuario(@Valid @RequestBody RegisterRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.crearUsuario(request));
    }
}
