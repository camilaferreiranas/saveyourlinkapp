package br.com.camilaferreiranas.saveyourlink.controller;

import br.com.camilaferreiranas.saveyourlink.entity.dto.LoginRequest;
import br.com.camilaferreiranas.saveyourlink.entity.dto.LoginResponse;
import br.com.camilaferreiranas.saveyourlink.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/login")
public class TokenController {

    private final LoginService loginService;

    @PostMapping
    public ResponseEntity<LoginResponse> login (@RequestBody LoginRequest loginRequest) {
        var login = loginService.login(loginRequest);
        return ResponseEntity.ok(login);
    }

}
