package com.example.demo.service;

import com.example.demo.model.AppUser;

import java.util.Optional;

public interface AppUserService {
    AppUser registerUser(AppUser user);
    Optional<AppUser> findByEmail(String email);
}
