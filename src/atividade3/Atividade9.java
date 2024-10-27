package atividade3;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeros[] = new int[80];
        int maior, menor, posicaoMaior = 0, posicaoMenor = 0;
        System.out.println("Insira o primeiro numero ");
        numeros[0] = scan.nextInt();
        maior = menor = numeros[0];
        for (int i = 0; i < 80; i++) {
            System.out.println("Insira o numero " + i);
            numeros[i] = scan.nextInt();
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicaoMaior = i;
            } else {
                if (numeros[i] < menor) {
                    menor = numeros[i];
                    posicaoMenor = i;
                }
            }
        }
        System.out.println("O maior numero é " + maior + " o menor número é " + menor);
        System.out.println("Com o maior número na posição: " + posicaoMaior);
        System.out.println("Com o menor número na posição: " + posicaoMenor);
        scan.close();
    }
}
