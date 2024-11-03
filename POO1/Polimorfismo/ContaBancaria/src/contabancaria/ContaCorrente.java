package contabancaria;

/**
 *
 * @author Lucas
 */
public class ContaCorrente extends ContaBancaria{
    
    private double limiteEspecial;

    public ContaCorrente(double limiteEspecial, String titular, double saldo, double rendaMensal) {
        super(titular, saldo, rendaMensal);
        
        if(limiteEspecial>getRendaMensal()*0.4){
            this.limiteEspecial = getRendaMensal()*0.4;
        }else{
            this.limiteEspecial = limiteEspecial;
        } 
    }   
    
    @Override
    public void sacar(double montante){
        
       if(montante<this.limiteEspecial){
           System.out.println("Saque indisponivel.");
       }else{
           setSaldo(getSaldo()-montante);
           System.out.println("Saque efetuado com sucesso!");
       }
    }
        
    public String toString(){
       return "Titular Conta Corrente: " + getTitular() + "; Saldo: R$" + getSaldo() + "; Renda Mensal: R$" + getRendaMensal() + "; Limite Especial: R$" + this.limiteEspecial + "\n";
    }
    
}