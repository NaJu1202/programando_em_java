package atividade3;

import java.util.Scanner;

public class Atidade8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char letra[] = new char[80];
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Insira a letra " + i);
            letra[i] = scan.next().charAt(0);
            if (Character.toLowerCase(letra[i]) == 'a') {
                cont++;
            } else {
                System.out.println("Não foram inseridas letras 'A'");
            }
        }
        System.out.println(cont);
        scan.close();
    }
}
