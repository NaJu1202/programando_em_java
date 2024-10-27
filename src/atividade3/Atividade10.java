package atividade3;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double temperatura[] = new double[7];
        double media = 0;
        for (int i = 0; i < 7; i++) {
            System.out.println("Insira a temperatura do dia: " + (i + 1) + "°");
            temperatura[i] = scan.nextDouble();
            media = media + temperatura[i];
        }
        media = media / 7;
        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] > media) {
                System.out.println("A media de temperatura foi: " + media);
                System.out.println("A temperatura " + temperatura[i] + "° é maior que a media");
            }
        }
        scan.close();
    }
}
