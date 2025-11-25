package com.example.jgtmsauth.service;

import com.example.jgtmsauth.dtos.AuthUserDto;
import com.example.jgtmsauth.dtos.TokenDto;
import com.example.jgtmsauth.models.AuthUser;

public interface AuthUserService {
    AuthUser save(AuthUserDto authUserDto);


    TokenDto login(AuthUserDto authUserDto);

    AuthUserDto findById(Long id);
    boolean existsById(Long id);
    TokenDto validate(String token);
}
