package contabancaria;

/**
 *
 * @author Lucas
 */
public class ContaBancaria {
    
    private String titular;
    private double saldo;
    private double rendaMensal;

    public ContaBancaria(String titular, double saldo, double rendaMensal) {
        
        if(titular.equals("")){
            this.titular = "nao informado";
        }else{
            this.titular = titular;
        }
        
        if(rendaMensal<2640.00){
           this.rendaMensal = 2640.00;
        }else{
           this.rendaMensal = rendaMensal;
        }
        
        this.saldo = saldo;
        
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }
    
    public void depositar(double montante){
        this.saldo = this.saldo + montante; 
    }
    
    public void sacar(double montante){
        if(this.saldo > montante){
            this.saldo = this.saldo - montante;
            System.out.println("Saque efetuado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente.");   
        }
    }
    
    public void verificarSaldo(){
        System.out.println("O saldo da conta de " + this.titular + " e de: R$" + this.saldo);
    }
    
    public String toString(){
       return "[Titular Conta: " + this.titular + "; Saldo: R$" + this.saldo + "; Renda Mensal: R$" + this.rendaMensal + "]\n";
    }
    
}
