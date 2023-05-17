package br.fatecrl.mvc.models;

public class Aluno {
    private String Matricula;
    private String Nome;
    private float P1;
    private float P2;

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getP1() {
        return P1;
    }

    public void setP1(float p1) {
        P1 = p1;
    }

    public float getP2() {
        return P2;
    }

    public void setP2(float p2) {
        P2 = p2;
    }

    public Aluno(String matricula, String nome, float p1, float p2) {
        Matricula = matricula;
        Nome = nome;
        P1 = p1;
        P2 = p2;
    }


}
