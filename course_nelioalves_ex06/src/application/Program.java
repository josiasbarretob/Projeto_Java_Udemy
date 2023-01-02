package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Favor insira um número inteiro : ");
        int n = scan.nextInt();

        float [] vetorAltura = new float[n];

        for (int i = 0 ; i < n ; i++) {
            System.out.println("Favor insira a sua altura : ");
            vetorAltura[i] = scan.nextFloat();
        }
        float soma = 0.0F;
        for (int i = 0 ; i < n ; i++){
            soma += vetorAltura[i];
        }
        float media = soma / n;

        System.out.printf("A média das idades digitadas é: %.2f" , media);

        scan.close();
    }
}
