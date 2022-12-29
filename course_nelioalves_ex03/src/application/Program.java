package application;

import entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee funcionario = new Employee();

        System.out.println("Name: ");
        System.out.println("Gloss Salary: ");
        System.out.println("Tax ($): ");
        funcionario.name = scan.nextLine();
        funcionario.glossSalary = scan.nextDouble();
        funcionario.tax = scan.nextDouble();

        System.out.println("Salário Líquido: " + funcionario.name + " , $ " + funcionario.salarioLiquido());

        System.out.println("Informe a porcentagem para incrementar o Salário (%): ");
        funcionario.porcent = scan.nextDouble();

        System.out.println("Salário Atualizado: " + funcionario.name + " , $ " + funcionario.newSalario());


        scan.close();
    }
}
