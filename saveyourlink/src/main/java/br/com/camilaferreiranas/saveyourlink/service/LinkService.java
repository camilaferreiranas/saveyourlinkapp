package br.com.camilaferreiranas.saveyourlink.service;

import br.com.camilaferreiranas.saveyourlink.entity.Link;
import br.com.camilaferreiranas.saveyourlink.entity.dto.CreateLinkRequest;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LinkService {

    Optional<Link> findById(Long id);

    List<Link> findByUserId(UUID id);

    Link save(CreateLinkRequest request);
}
