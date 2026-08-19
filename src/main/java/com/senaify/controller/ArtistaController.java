package com.senaify.controller;

import com.senaify.model.Artista;
import com.senaify.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artistas")
public class ArtistaController {

    @Autowired
    private ArtistaService artistaService;

    @GetMapping
    public ResponseEntity<List<Artista>> listarTodos() {
        return ResponseEntity.ok(artistaService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Artista> buscarPorId(@PathVariable Long id) {
        return artistaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Artista> salvar(@RequestBody Artista artista) {
        Artista salvo = artistaService.salvar(artista);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        artistaService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Artista>> buscarPorNome(@RequestParam String nome) {
        return ResponseEntity.ok(artistaService.buscarPorNome(nome));
    }

    @GetMapping("/nacionalidade/{nacionalidade}")
    public ResponseEntity<List<Artista>> buscarPorNacionalidade(@PathVariable String nacionalidade) {
        return ResponseEntity.ok(artistaService.buscarPorNacionalidade(nacionalidade));
    }
}
