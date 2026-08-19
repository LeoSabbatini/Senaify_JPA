package com.senaify.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "musicas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String genero;

    @Column(name = "duracao_segundos")
    private Integer duracaoSegundos;

    @Column(name = "ano_lancamento")
    private Integer anoLancamento;

    @ManyToOne
    @JoinColumn(name = "artista_id", nullable = false)
    private Artista artista;

    @OneToOne(mappedBy = "musica", cascade = CascadeType.ALL)
    private Estatistica estatistica;
}
