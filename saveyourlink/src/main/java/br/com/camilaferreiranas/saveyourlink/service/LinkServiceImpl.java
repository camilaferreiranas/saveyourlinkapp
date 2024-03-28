package br.com.camilaferreiranas.saveyourlink.service;

import br.com.camilaferreiranas.saveyourlink.entity.Link;
import br.com.camilaferreiranas.saveyourlink.entity.User;
import br.com.camilaferreiranas.saveyourlink.entity.dto.CreateLinkRequest;
import br.com.camilaferreiranas.saveyourlink.repository.LinkRepository;
import br.com.camilaferreiranas.saveyourlink.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class LinkServiceImpl implements LinkService {

    private final LinkRepository repository;
    private final UserRepository userRepository;
    @Override
    public Optional<Link> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Link> findByUserId(UUID id) {
        var user = findUser(id);
        return repository.findByUser(user);
    }

    @Override
    public Link save(CreateLinkRequest request) {
        var link = new Link();
        var user = findUser(request.userId());
        link.setTitle(request.title());
        link.setLink(request.link());
        link.setUser(user);
        return repository.save(link);
    }

    private User findUser(UUID id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
