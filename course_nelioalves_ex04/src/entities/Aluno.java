package entities;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularNota(){
        return nota1 + nota2 + nota3;
    }

    public double diferencaNota(){
        return 60 - calcularNota();
    }
}
