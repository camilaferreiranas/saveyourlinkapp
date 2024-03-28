package br.com.camilaferreiranas.saveyourlink.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Link {

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;

    private String title;

    private String link;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
