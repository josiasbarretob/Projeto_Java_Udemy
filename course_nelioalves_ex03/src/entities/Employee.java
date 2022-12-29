package entities;

public class Employee {
    public String name;
    public double glossSalary;
    public double tax;
    public double porcent;

    public double salarioLiquido(){
        return glossSalary - tax;
    }

    public double newSalario(){
        return glossSalary += (glossSalary * (porcent/100));
    }
}
