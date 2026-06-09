package com.taller.actividad.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record UserDataUpdateRequest(
        @NotNull(message = "El nombre es obligatorio.")
        String name,
        @NotNull(message = "El apellido es obligatorio.")
        String lastName,
        @Min(value = 18, message = "La edad minima es 18 años.")
        Integer age
) {}
