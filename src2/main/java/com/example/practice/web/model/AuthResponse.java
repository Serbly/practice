package com.example.practice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthResponse {
    private Long id;

    private String token;

    private String refreshToken;

    private String username;

    private List<String> roles;

    private boolean isDeleted;
}
