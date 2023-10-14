package com.restAPI.demo.controller;

import com.restAPI.demo.entity.Aluno;
import com.restAPI.demo.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> create() {
        Aluno aluno = new Aluno(1,"Bruno");
        this.alunoRepository.save(aluno);
        return this.alunoRepository.findAll();
    }
}
