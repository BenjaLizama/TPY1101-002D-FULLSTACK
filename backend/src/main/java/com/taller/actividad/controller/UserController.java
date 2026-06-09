package com.taller.actividad.controller;

import com.taller.actividad.dto.LoginRequest;
import com.taller.actividad.dto.RegisterRequest;
import com.taller.actividad.dto.UserDataResponse;
import com.taller.actividad.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/usuarios")
@CrossOrigin(origins = "*")
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDataResponse> agregarUsuario(@Valid @RequestBody RegisterRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.crearUsuario(request));
    }

    @PostMapping("/login")
    public ResponseEntity<UserDataResponse> iniciarSesion(@Valid @RequestBody LoginRequest request) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.iniciarSesion(request));
    }

    @GetMapping("/")
    public ResponseEntity<List<UserDataResponse>> listarUsuarios() {
        List<UserDataResponse> data = userService.listarUsuarios();

        if (data.isEmpty()) return ResponseEntity.status(HttpStatus.NO_CONTENT).body(data);

        return ResponseEntity.status(HttpStatus.OK).body(data);
    }
}
