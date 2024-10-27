package atividade3;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomes[] = new String[50];
        String sair = "sair";
        int i = 1;
        System.out.println("Insira o nome do primeiro aluno");
        nomes[0] = scan.next();
        if (nomes[0].equalsIgnoreCase(sair)) {
            System.out.println("Não foi inserido nenhum aluno");
        } else {
            for (; i < 50; i++) {
                System.out.println("Insira o nome do aluno: [Digite [SAIR] para finalizar]");
                nomes[i] = scan.next();
                if (nomes[i].equalsIgnoreCase(sair)) {
                    System.out.println("Você Encerrou o programa.");
                    scan.close();
                    break;
                }
            }
            System.out.println("-----------------");
            for (String n : nomes) {
                if (n == null || n.equalsIgnoreCase(sair)) {
                    break;
                } else {
                    System.out.println(n);
                }
            }
            System.out.println("Foram inseridos " + i + " nomes");

        }
        scan.close();
    }
}
