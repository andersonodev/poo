package model;

import java.util.HashSet;
import java.util.Set;

public class Professor {

    private String matricula;
    private String nome;
    private String titulacao;
    private Set<Turma> Turma;

    public Professor(String matricula, String nome, String titulacao) {
        this.Turma = new HashSet<Turma>();
        this.matricula = matricula;
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public void addTurma(Turma turma) {
        this.Turma.add(turma);
    }

    public void removeTurma(Turma turma) {
        this.Turma.remove(turma);
    }

    public Set<Turma> getTurma() {
        return Turma;
    }

    public void setTurma(Set<Turma> turma) {
        Turma = turma;
    }
}
