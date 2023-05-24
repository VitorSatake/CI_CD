package br.fatec.mvc2.mvc.controllers;

import br.fatec.mvc2.mvc.models.Mercado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mercados")
public class MercadoController {

    private static final List<Mercado> _mercados = new ArrayList<Mercado>();

    public MercadoController() {
        _mercados.add(new Mercado(" Dia", "Canal 3, numero 345 "));
        _mercados.add(new Mercado(" Assai", "Avenida Anan Costa, numero 56 "));
        _mercados.add(new Mercado(" Pao de Açucar", "Avenida Presidente Wilson 89 "));
        _mercados.add(new Mercado(" Extra", "Avenida Presidente Wilson 89 "));
    }

    @GetMapping
    public String getMercado(Model model){
        model.addAttribute("mercado", _mercados);
        return "Mercados";

    }
}