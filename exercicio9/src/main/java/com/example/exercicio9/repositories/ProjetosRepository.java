package com.example.exercicio9.repositories;

import com.example.exercicio9.models.ProjetosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetosRepository extends JpaRepository<ProjetosModel, Long> {

}