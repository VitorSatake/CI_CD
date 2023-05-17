package br.fatecrl.mvc.controllers;

import br.fatecrl.mvc.models.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/alunos")
public class AlunosController {

    private static final List<Aluno> _alunos = new ArrayList<Aluno>();

    public AlunosController() {
        _alunos.add(new Aluno("7070", "Claudio", 10, 10));
        _alunos.add(new Aluno("5050", "Pedro", 6, 8));
        _alunos.add(new Aluno("1212", "Tiago", 7, 9));
        _alunos.add(new Aluno("3333", "Paulo", 5, 8));
    }

    @GetMapping
    public String getAlunos(Model model){
        model.addAttribute("alunos", _alunos);
        return "alunos";

    }
}
