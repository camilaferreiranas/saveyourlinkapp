package br.com.camilaferreiranas.saveyourlink.service;

import br.com.camilaferreiranas.saveyourlink.entity.User;
import br.com.camilaferreiranas.saveyourlink.entity.dto.CreateUserRequest;

import java.util.Optional;
import java.util.UUID;

public interface UserService {

    User save(CreateUserRequest userRequest);

    Optional<User> findById(UUID id);
}
