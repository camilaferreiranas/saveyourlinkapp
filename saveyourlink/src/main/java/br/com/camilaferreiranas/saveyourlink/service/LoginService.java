package br.com.camilaferreiranas.saveyourlink.service;


import br.com.camilaferreiranas.saveyourlink.entity.dto.LoginRequest;
import br.com.camilaferreiranas.saveyourlink.entity.dto.LoginResponse;

public interface LoginService {

    LoginResponse login(LoginRequest loginRequest);
}
