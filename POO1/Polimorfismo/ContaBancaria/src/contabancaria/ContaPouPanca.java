package contabancaria;

/**
 *
 * @author Lucas
 */
public class ContaPouPanca extends ContaBancaria{

    private double taxaJuros;

    public ContaPouPanca(double taxaJuros, String titular, double saldo, double rendaMensal) {
        super(titular, saldo, rendaMensal);
        if(taxaJuros<0.6 || taxaJuros>2.8){
            this.taxaJuros = 0.6;
        }else{
            this.taxaJuros = taxaJuros;
        }
    
    }
    
    public double getTaxaJuros() {
        return taxaJuros;
    }
    
    public void aplicarJuros(){
        setSaldo(getSaldo() + ( getSaldo() * this.taxaJuros));
    }
    
    public String toString(){
        return "[Titular Conta: " + getTitular() + "; Saldo: R$" + getSaldo() + "; Renda Mensal: R$" + getRendaMensal() + "; Taxa Juros: " + this.taxaJuros + "%]\n";
    }
    
}
