package atividade7;

public class Pauta {
    private int matricula;
    private int numFalta;
    private double nota1;
    private double nota2;
    private String nomeAluno;

    public Pauta() {
        this.matricula = 0;
        this.numFalta = 0;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nomeAluno = "";
    }

    public Pauta(int matricula, int numFalta, float nota1, float nota2, String nomeAluno) {
        this.matricula = matricula;
        this.numFalta = numFalta;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nomeAluno = nomeAluno;
    }

    // gets
    public int getMatricula() {
        return this.matricula;
    }

    public int getNumFalta() {
        return this.numFalta;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public String getNomeAluno() {
        return this.nomeAluno;
    }

    // sets
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNumFalta(int numFalta) {
        this.numFalta = numFalta;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "Matrucula: " + matricula + ", numFalta: " + numFalta + ", nota1: " + nota1 + ", nota2: " + nota2
                + ", nomeAluno: " + nomeAluno;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }
}