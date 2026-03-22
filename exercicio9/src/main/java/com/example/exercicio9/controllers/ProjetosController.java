package com.example.exercicio9.controllers;

import java.util.List;
import java.util.Optional;

import com.example.exercicio9.models.ProjetosModel;
import com.example.exercicio9.services.ProjetosService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/projetos")
public class ProjetosController {

    private final ProjetosService projetosService;

    public ProjetosController(ProjetosService projetosService) {
        this.projetosService = projetosService;
    }

    @PostMapping
    public ProjetosModel criarProjeto(@RequestBody ProjetosModel projeto) {
        return projetosService.criarProjeto(projeto);
    }

    @GetMapping
    public List<ProjetosModel> listarProjetos() {
        return projetosService.listarProjetos();
    }

    @GetMapping("/{id}")
    public Optional<ProjetosModel> buscarPorId(@PathVariable Long id) {
        return projetosService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarProjeto(@PathVariable Long id) {
        projetosService.deletarProjeto(id);
    }
}