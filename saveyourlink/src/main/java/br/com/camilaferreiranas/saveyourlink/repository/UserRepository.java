package br.com.camilaferreiranas.saveyourlink.repository;

import br.com.camilaferreiranas.saveyourlink.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
