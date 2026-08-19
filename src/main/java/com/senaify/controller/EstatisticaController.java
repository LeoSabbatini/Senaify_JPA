package com.senaify.controller;

import com.senaify.model.Estatistica;
import com.senaify.service.EstatisticaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estatisticas")
@RequiredArgsConstructor
public class EstatisticaController {

    private final EstatisticaService estatisticaService;

    @GetMapping
    public ResponseEntity<List<Estatistica>> listarTodas() {
        return ResponseEntity.ok(estatisticaService.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estatistica> buscarPorId(@PathVariable Long id) {
        return estatisticaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Estatistica> salvar(@RequestBody Estatistica estatistica) {
        Estatistica salva = estatisticaService.salvar(estatistica);
        return ResponseEntity.status(HttpStatus.CREATED).body(salva);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        estatisticaService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/musica/{musicaId}")
    public ResponseEntity<Estatistica> buscarPorMusica(@PathVariable Long musicaId) {
        return estatisticaService.buscarPorMusicaId(musicaId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/mais-curtidas")
    public ResponseEntity<List<Estatistica>> buscarMaisCurtidas(@RequestParam Long minCurtidas) {
        return ResponseEntity.ok(estatisticaService.buscarMaisCurtidas(minCurtidas));
    }
}
