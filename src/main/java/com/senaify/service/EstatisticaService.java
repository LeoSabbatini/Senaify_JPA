package com.senaify.service;

import com.senaify.model.Estatistica;
import com.senaify.repository.EstatisticaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstatisticaService {

    private final EstatisticaRepository estatisticaRepository;

    public List<Estatistica> listarTodas() {
        return estatisticaRepository.findAll();
    }

    public Optional<Estatistica> buscarPorId(Long id) {
        return estatisticaRepository.findById(id);
    }

    public Estatistica salvar(Estatistica estatistica) {
        return estatisticaRepository.save(estatistica);
    }

    public void deletar(Long id) {
        estatisticaRepository.deleteById(id);
    }

    public Optional<Estatistica> buscarPorMusicaId(Long musicaId) {
        return estatisticaRepository.findByMusica_id(musicaId);
    }

    public List<Estatistica> buscarMaisCurtidas(Long curtidas) {
        return estatisticaRepository.buscarMaisCurtidas(curtidas);
    }
}
