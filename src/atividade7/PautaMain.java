package atividade7;

import java.util.Scanner;

public class PautaMain {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Pauta aluno = new Pauta();
        char opcao;
        do {
            System.out.println("1. Cadastrar um aluno\r\n" + //
                    "2. Mostrar todos os dados do aluno\r\n" + //
                    "3. Verificar se o aluno está reprovado por falta\r\n" + //
                    "4. Mostrar a média do aluno\r\n" + //
                    "5. Mostrar situação de aprovação ou reprovação\r\n"
                    + "6. Finalizar operações");
            opcao = scan.next().charAt(0);

            switch (opcao) {
                case '1':
                    System.out.println("Inciando cadastro..");
                    cadastrarUsuario(aluno);
                    break;
                case '2':
                    System.out.println(aluno.toString());
                    break;
                case '3':
                    if (aluno.calcularFaltas() == 0) {
                        System.out.println("aluno reprovado");
                    } else {
                        System.out.println(aluno.getNomeAluno() + " pode faltar ainda " + aluno.calcularFaltas()
                                + " dias.");
                    }
                    break;
                case '4':
                    System.out.println(aluno.getNomeAluno() + " tem média: " + aluno.calcularMedia());
                    break;
                case '5':
                    if (aluno.situacaoAluno() == true) {
                        System.out.println("O aluno " + aluno.getNomeAluno() + " está REPROVADO.");
                    } else {
                        System.out.println("O aluno " + aluno.getNomeAluno() + " está APROVADO.");
                    }
                    break;
                case '6':
                    System.out.println("saindo....");
                    break;
                default:
                    System.out.println("opcao invalida");
                    break;
            }
        } while (opcao != 6);
    }

    static void cadastrarUsuario(Pauta aluno) {
        System.out.println("Insira a matricula: ");
        aluno.setMatricula(scan.nextInt());
        System.out.println("Insira o numero de faltas: ");
        aluno.setNumFalta(scan.nextInt());
        System.out.println("Insira a nota 1: ");
        aluno.setNota1(scan.nextDouble());
        System.out.println("Insira a nota 2: ");
        aluno.setNota2(scan.nextDouble());
        System.out.println("Insira o nome do aluno: ");
        aluno.setNomeAluno(scan.next());
    }

}
