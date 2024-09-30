package aulagettersetter;

/**
 *
 * @author IFTM
 */
public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;
    
    
    //metodos getters - eles recuperam informações
    //metodos setters - adicionam informações
    
    public String getMarca(){
        
        return this.marca; 
        
    }
    
    public String getModelo(){
        
        return this.modelo;
        
    }
    
    public int getAno(){
        
        return this.ano;
        
    }
    
    public void setMarca(String marca){
        
        this.marca = marca;
        
    }
    
    public void setModelo(String modelo){
     
        this.modelo = modelo;
        
    }  
    
    public void setAno(int ano){
        
        this.ano = ano;
        
    }
   
}
