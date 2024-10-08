package aulapoosmartphone;

/**
 *
 * @author IFTM
 */
public class Smartphone {
    
    
    private String modelo;
    private String marca;
    private  int memoriaRAM;
    private int hd;
    
    public Smartphone(){}
    
    public void setModelo(String modelo){
        
        if(modelo.equals("Apple") || modelo.equals("Xiaomi") || modelo.equals("Samsung") ){        
            this.modelo = modelo;         
        }else{           
           this.modelo = "Nao informado";         
        }          
    }
    
    public void setMarca(String marca){    
        this.marca = marca;   
    }
    
    public void setMemoriaRAM(int memoriaRAM){     
        this.memoriaRAM = memoriaRAM; 
    }
    
    public void setHD(int hd){
       this.hd = hd;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getHD() {
        return hd;
    }

    public Smartphone(String modelo, String marca, int memoriaRAM, int hd) {
        
        if(memoriaRAM<=0){
            this.memoriaRAM=100;
        }else{
            this.memoriaRAM = memoriaRAM;
        }
        
        if(hd<=0){
            this.hd=100;
        }else{
            this.hd = hd;
        }
        
        this.modelo = modelo;
        this.marca = marca;
    }
  
}
