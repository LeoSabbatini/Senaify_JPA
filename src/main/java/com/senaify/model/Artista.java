package com.senaify.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "artistas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String nacionalidade;

    private String biografia;

    @Column(name = "foto_url")
    private String fotoUrl;

    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL)
    private List<Musica> musicas;
}
