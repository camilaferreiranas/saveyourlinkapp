package br.com.camilaferreiranas.saveyourlink.service;

import br.com.camilaferreiranas.saveyourlink.entity.User;
import br.com.camilaferreiranas.saveyourlink.entity.dto.CreateUserRequest;
import br.com.camilaferreiranas.saveyourlink.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User save(CreateUserRequest userRequest) {
        var user = new User();
        user.setEmail(userRequest.email());
        user.setFullName(userRequest.fullName());
        user.setPassword(userRequest.password());
        return repository.save(user);
    }

    @Override
    public Optional<User> findById(UUID id) {
        return repository.findById(id);
    }
}
