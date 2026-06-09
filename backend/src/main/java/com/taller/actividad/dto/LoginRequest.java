package com.taller.actividad.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record LoginRequest(
        @NotNull(message = "El campo no puede estar vacio.")
        @Email(message = "El formato del correo no es valido.")
        String email,

        @NotNull(message = "La contraseña es obligatoria.")
        @Size(min = 8, message = "La contraseña debe contener al menos 8 caracteres.")
        String password
) {}
