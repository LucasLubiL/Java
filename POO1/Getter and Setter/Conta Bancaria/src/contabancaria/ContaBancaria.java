package contabancaria;

/**
 *
 * @author User
 */
public class ContaBancaria {
    
    private double saldo;
    private String titular;
    private double deposito;
    private double sacar;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.saldo = deposito + saldo;
        this.deposito = deposito;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
        saldo=saldo-sacar;
    }
    
    
}
