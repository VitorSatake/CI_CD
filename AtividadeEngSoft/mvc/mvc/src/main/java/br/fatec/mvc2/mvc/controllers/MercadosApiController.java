package br.fatec.mvc2.mvc.controllers;

import br.fatec.mvc2.mvc.models.Mercado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/mercados")
public class MercadosApiController {


    private static final List<Mercado> mercados = new ArrayList<Mercado>();

    public MercadosApiController() {

        mercados.add(new Mercado("Dia", "Canal 3, numero 345"));
        mercados.add(new Mercado("Assai", "Avenida Anan Costa, numero 56"));
        mercados.add(new Mercado("Pao de Açucar", "Avenida Presidente Wilson 89"));
    }

    @GetMapping
    public List<Mercado> getMercado(){
        return mercados;
    }

}