package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Conta conta;

        System.out.print("Por favor, informe o número da conta: ");
        int numero = scan.nextInt();
        System.out.print("Enter account holder: ");
        scan.nextLine();
        String holder = scan.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = scan.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scan.nextDouble();
            conta = new Conta(numero, conta.getTitular(), initialDeposit);
        }
        else {
            account = new Account(number, holder);
        }

    }
}
