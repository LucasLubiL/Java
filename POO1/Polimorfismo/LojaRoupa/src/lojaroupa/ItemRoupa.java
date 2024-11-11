package lojaroupa;

/**
 *
 * @author Lucas
 */
public abstract class ItemRoupa {
    
    private String descricao;
    private double valor;
    private boolean disponivel;
    
    public ItemRoupa(){}
    
    public abstract void emprestar();
    
    public abstract void devolver();

    public ItemRoupa(String descricao, double valor, boolean disponivel) {
        
        if(descricao.equals("calca") || descricao.equals("jaqueta") || descricao.equals("T-Shirt") || descricao.equals("vestido") || descricao.equals("blusa")){          
            this.descricao = descricao;           
        }else{        
            System.out.println("Item sem cadastro no sistema");
            this.descricao = "sem cadastro";          
        }
        
        if(valor==0){
            this.valor = 10.00;   
        }else{            
            this.valor = valor;           
        }
        
        this.disponivel = disponivel;
        
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDescricao(String descricao) {
        
        if(descricao.equals("calca") || descricao.equals("jaqueta") || descricao.equals("T-Shirt") || descricao.equals("vestido") || descricao.equals("blusa")){          
            this.descricao = descricao;           
        }else{        
            System.out.println("Item sem cadastro no sistema");
            this.descricao = "sem cadastro";          
        }
        
    }

    public void setValor(double valor) {
        
        if(valor==0){
            this.valor = 10.00;   
        }else{            
            this.valor = valor;           
        }
        
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public String toString(){
        
        return "[Descricao: " + this.descricao + "; Valor: " + this.valor + "; Disponibilidade: " + (disponivel ? "Sim" : "Nao");
    }
    
}
