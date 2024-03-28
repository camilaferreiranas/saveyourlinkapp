package br.com.camilaferreiranas.saveyourlink.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true)
    private String email;

    private String fullName;

    private String password;

    @OneToMany(mappedBy = "user")
    private List<Link> links;

}
