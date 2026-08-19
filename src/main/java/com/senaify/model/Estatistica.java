package com.senaify.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "estatisticas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estatistica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total_reproducoes")
    private Long totalReproducoes;

    @Column(name = "total_curtidas")
    private Long totalCurtidas;

    @Column(name = "total_compartilhamentos")
    private Long totalCompartilhamentos;

    @OneToOne
    @JoinColumn(name = "musica_id", nullable = false)
    private Musica musica;
}
