package com.taller.actividad.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record RegisterRequest(
        @Email(message = "El formato del correo no es valido.")
        @NotNull(message = "El correo es obligatorio.")
        String email,

        @Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres.")
        String password,

        @NotNull(message = "El nombre no es obligatorio.")
        String name,

        @NotNull(message = "El apellido es obligatorio.")
        String lastName,

        @NotNull(message = "La edad es obligatoria.")
        @Min(value = 18, message = "La edad minima es 18 años.")
        Integer age
) {}
