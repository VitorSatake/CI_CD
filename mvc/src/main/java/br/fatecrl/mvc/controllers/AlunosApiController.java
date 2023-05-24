package br.fatecrl.mvc.controllers;

import br.fatecrl.mvc.models.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunosApiController {


    private static final List<Aluno> alunos = new ArrayList<Aluno>();

    public AlunosApiController() {

        alunos.add(new Aluno("123456", "Claudio", 10, 8));
        alunos.add(new Aluno("222222", "Mariana", 6, 8));
        alunos.add(new Aluno("333333", "Guilherme", 6, 4));
    }

    @GetMapping
    public List<Aluno> getAlunos(){
        return alunos;
    }

}