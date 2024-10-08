package aulapoosmartphone;

/**
 *
 * @author IFTM
 */
public class Principal {

    
    public static void main(String[] args) {
        
        Smartphone celular = new Smartphone();
        celular.setModelo ("Apple");
        celular.setMarca ("iphone");
        celular.setMemoriaRAM(200);
        celular.setHD (500);
        
        System.out.println("Modelo = " + celular.getModelo() + ";");
        System.out.println("Marca = " + celular.getMarca() + ";");
        System.out.println("MemoriaRAM = " + celular.getMemoriaRAM() + ";");
        System.out.println("HD = " + celular.getHD() + ".");

        
        Smartphone celular1 = new Smartphone("A20", "Samsung", -1, -1);  
        System.out.println("Modelo = " + celular1.getModelo() + ";");
        System.out.println("Marca = " + celular1.getMarca() + ";");
        System.out.println("MemoriaRAM = " + celular1.getMemoriaRAM() + ";");
        System.out.println("HD = " + celular1.getHD() + ".");
        
        
    }
    
}
