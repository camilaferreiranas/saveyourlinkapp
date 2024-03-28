package br.com.camilaferreiranas.saveyourlink.repository;

import br.com.camilaferreiranas.saveyourlink.entity.Link;
import br.com.camilaferreiranas.saveyourlink.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkRepository extends JpaRepository<Link, Long> {

    List<Link> findByUser(User user);
}
