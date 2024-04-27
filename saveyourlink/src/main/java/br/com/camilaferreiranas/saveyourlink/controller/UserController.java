package br.com.camilaferreiranas.saveyourlink.controller;

import br.com.camilaferreiranas.saveyourlink.entity.User;
import br.com.camilaferreiranas.saveyourlink.entity.dto.CreateUserRequest;
import br.com.camilaferreiranas.saveyourlink.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {


    private final UserService userService;


    @PostMapping
    public ResponseEntity<User> save(@RequestBody CreateUserRequest request) {
        return ResponseEntity.ok(userService.save(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<Optional<User>> findUserByEmail(@PathVariable String email) {
        return ResponseEntity.ok(userService.findUserByEmail(email));
    }

}
