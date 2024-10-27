package classeEobjeto;

//atividade 8
public class Conta {
    // atributos
    private int numeroConta;
    private String titular;
    private double saldo;

    // contrutores
    public Conta() {
        this.numeroConta = 0;
        this.titular = "";
        this.saldo = 0;
    }

    public Conta(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // gets
    public int getNumeroConta() {
        return this.numeroConta;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // sets
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // toString
    public String toString() {
        return this.numeroConta + ", " + this.titular + ", " + this.saldo;
    }

    public boolean sacarDinheiro(double saque) {
        if (saque > this.saldo) {
            return false;
        } else {
            this.saldo = this.saldo - saque;
            return true;
        }
    }

    public double depositarDinheiro(double deposito) {
        this.saldo = this.saldo + deposito;
        return this.saldo;
    }

}
