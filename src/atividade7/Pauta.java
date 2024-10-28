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

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + "| numero de faltas: " + numFalta + "| nota 1: " + nota1 + "| nota 2: "
                + nota2
                + "| nome do aluno: " + nomeAluno;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public int calcularFaltas() {
        if (this.numFalta <= 25) {
            return 25 - this.numFalta;
        }
        return this.numFalta = 0;
    }

    public boolean situacaoAluno() {
        if (this.numFalta > 25 & (calcularMedia() >= 7)) {
            return true;
        }
        return false;
    }
}