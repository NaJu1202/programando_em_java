package atividade7;

import java.util.Scanner;

public class PautaMain {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Pauta aluno = new Pauta();
        char opcao;

        System.out.println("1. Cadastrar um aluno\r\n" + //
                "2. Mostrar todos os dados do aluno\r\n" + //
                "3. Verificar se o aluno está reprovado por falta\r\n" + //
                "4. Mostrar a média do aluno\r\n" + //
                "5. Mostrar situação de aprovação ou reprovação\r\n"
                + "6. Finalizar operações");
        opcao = scan.next().charAt(0);

        scan.close();
    }
}
