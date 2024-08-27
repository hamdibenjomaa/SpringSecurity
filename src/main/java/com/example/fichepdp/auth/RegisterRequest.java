package com.example.fichepdp.auth;

import com.example.fichepdp.user.Role;
import com.example.fichepdp.user.Service;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String name;
    private String email;
    private String password;
    private Role role ;
    private Service service;
}