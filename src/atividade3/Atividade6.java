package atividade3;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int[] vet = new int[3];
        int soma = 0;
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o " + i + ":");
            vet[i] = scan.nextInt();
            soma = soma + vet[i];
        }
        System.out.println("A soma dos numeros inseridos é " + soma);
        scan.close();
    }
}
