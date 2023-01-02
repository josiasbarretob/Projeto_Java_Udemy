package entities;

public class Conta {
    private int numero;
    private String titular;
    private double saldoConta;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        depositarDinheiro (depositoInicial);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void depositarDinheiro (double quantidadeDeposito){
        saldoConta += quantidadeDeposito;
    }

    public void sacarDinheiro (double quantidadeSaque){
        saldoConta -= quantidadeSaque + 5.0;
    }
}
