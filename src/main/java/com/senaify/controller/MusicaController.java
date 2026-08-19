package com.senaify.controller;

import com.senaify.model.Musica;
import com.senaify.service.MusicaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/musicas")
@RequiredArgsConstructor
public class MusicaController {

    private final MusicaService musicaService;

    @GetMapping
    public ResponseEntity<List<Musica>> listarTodas() {
        return ResponseEntity.ok(musicaService.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Musica> buscarPorId(@PathVariable Long id) {
        return musicaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Musica> salvar(@RequestBody Musica musica) {
        Musica salva = musicaService.salvar(musica);
        return ResponseEntity.status(HttpStatus.CREATED).body(salva);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        musicaService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/genero/{genero}")
    public ResponseEntity<List<Musica>> buscarPorGenero(@PathVariable String genero) {
        return ResponseEntity.ok(musicaService.buscarPorGenero(genero));
    }

    @GetMapping("/artista/{artistaId}")
    public ResponseEntity<List<Musica>> buscarPorArtista(@PathVariable Long artistaId) {
        return ResponseEntity.ok(musicaService.buscarPorArtista(artistaId));
    }

    @GetMapping("/ano/{ano}")
    public ResponseEntity<List<Musica>> buscarPorAno(@PathVariable Integer ano) {
        return ResponseEntity.ok(musicaService.buscarPorAnoLancamento(ano));
    }
}
