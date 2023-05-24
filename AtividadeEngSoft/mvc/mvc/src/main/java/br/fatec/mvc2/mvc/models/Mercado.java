package br.fatec.mvc2.mvc.models;

public class Mercado {
    private String Nome;
    private String Endereco;


    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }



    public Mercado(String nome, String endereco) {
        Endereco = endereco;
        Nome = nome;
    }


}
