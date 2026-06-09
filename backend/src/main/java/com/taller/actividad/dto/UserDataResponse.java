package com.taller.actividad.dto;

import lombok.Builder;

@Builder
public record UserDataResponse(
        String name,
        String lastName,
        Integer age,
        String email
) {}
