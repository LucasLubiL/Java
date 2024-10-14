package figurasgeométricas;

/**
 *
 * @author Lucas
 */
public class Principal {

    public static void main(String[] args) {
       
        FigurasGeometricas figura = new FigurasGeometricas();
        
        figura.setNomeFigura("quadrado");
        figura.setLado(4);
        System.out.println("Figura: " + figura.getNomeFigura());
        System.out.println("Lado: " + figura.getLado());
        System.out.println("Area: " + figura.calcularAreaFigura(figura.getNomeFigura()) + "\n");
        
        FigurasGeometricas figura2 = new FigurasGeometricas();
        figura2.setNomeFigura("triangulo");
        figura2.setBase(5);
        figura2.setAltura(8);
        figura2.calcularAreaFigura("triangulo");
        System.out.println("Figura: " + figura2.getNomeFigura());
        System.out.println("Base: " + figura2.getBase());
        System.out.println("Altura: " + figura2.getAltura());
        System.out.println("Area: " + figura2.calcularAreaFigura(figura2.getNomeFigura()) + "\n");
        
        FigurasGeometricas figura3 = new FigurasGeometricas();
        figura3.setNomeFigura("trapezio");
        figura3.setBaseMaior(10);
        figura3.setBaseMenor(5);
        figura3.setAltura(15);
        System.out.println("Figura: " + figura3.getNomeFigura());
        System.out.println("Base Maior: " + figura3.getBaseMaior());
        System.out.println("Base Menor: " + figura3.getBaseMenor());
        System.out.println("Altura: " + figura3.getAltura());
        System.out.println("Area: " + figura3.calcularAreaFigura(figura3.getNomeFigura()) + "\n");
        
        FigurasGeometricas figura4 = new FigurasGeometricas(15,10,5,"trapezio");
        System.out.println("Figura: " + figura4.getNomeFigura());
        System.out.println("Base Maior: " + figura4.getBaseMaior());
        System.out.println("Base Maior: " + figura4.getBaseMenor());
        System.out.println("Altura: " + figura4.getAltura());
        System.out.println("Area: " + figura4.calcularAreaFigura(figura4.getNomeFigura()) + "\n");
      
    }
}
