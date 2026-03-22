package com.example.exercicio9.services;

import java.util.List;
import java.util.Optional;

import com.example.exercicio9.models.ProjetosModel;
import com.example.exercicio9.repositories.ProjetosRepository;
import org.springframework.stereotype.Service;


@Service
public class ProjetosService {

    private final ProjetosRepository projetosRepository;

    public ProjetosService(ProjetosRepository projetosRepository) {
        this.projetosRepository = projetosRepository;
    }

    public ProjetosModel criarProjeto(ProjetosModel projeto) {
        return projetosRepository.save(projeto);
    }

    public List<ProjetosModel> listarProjetos() {
        return projetosRepository.findAll();
    }

    public Optional<ProjetosModel> buscarPorId(Long id) {
        return projetosRepository.findById(id);
    }

    public void deletarProjeto(Long id) {
        projetosRepository.deleteById(id);
    }
}