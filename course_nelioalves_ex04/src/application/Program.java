package application;

import entities.Aluno;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Favor insira o seu nome: ");
        aluno.nome = scan.nextLine();
        System.out.println("Favor insira a 1ª nota: ");
        aluno.nota1 = scan.nextDouble();
        System.out.println("Favor insira a 2ª nota: ");
        aluno.nota2 = scan.nextDouble();
        System.out.println("Favor insira a 3ª nota: ");
        aluno.nota3 = scan.nextDouble();

        System.out.printf("Nota Final do Aluno: %.2f %n", aluno.calcularNota());

        if(aluno.calcularNota() > 60){
            System.out.println("Aprovado!");
       }
        else{
            System.out.println("Reprovado!");
            System.out.println("Pontos a serem alcançados: " + aluno.diferencaNota());
        }
        scan.close();
    }
}
