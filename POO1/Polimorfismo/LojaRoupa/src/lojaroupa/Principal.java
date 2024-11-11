package lojaroupa;

/**
 *
 * @author Lucas
 */
public class Principal {

    public static void main(String[] args) {
        
        FilialPatrocinioLojaFisica compra1 = new FilialPatrocinioLojaFisica();
        compra1.setDescricao("calca");
        compra1.setValor(50.00);
        compra1.setDisponivel(true);
        compra1.setGerente("Lucas Amaral");
        compra1.setEndereco("Rua Josefino Castro");
        System.out.println(compra1.toString());
        compra1.emprestar();
        System.out.println(compra1.toString());
        compra1.devolver();
        System.out.println(compra1.toString());
        
        System.out.println("\n");
        
        FilialPatrocinioLojaFisica compra2 = new FilialPatrocinioLojaFisica();
        compra2.setDescricao("calca");
        compra2.setValor(60.00);
        compra2.setDisponivel(false);
        compra2.setGerente("Luciano");
        compra2.setEndereco("Rua Castro Josefino");
        System.out.println(compra2.toString());
        compra2.emprestar();
        System.out.println(compra2.toString());
        compra2.devolver();
        System.out.println(compra2.toString());
        
        System.out.println("\n\n///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n\n");
        
        FilialPatosLojaVirtual compra3 = new FilialPatosLojaVirtual();
        compra3.setDescricao("blusa");
        compra3.setValor(40.00);
        compra3.setDisponivel(true);
        compra3.setURL("www.abcd.com");
        compra3.setStatusEntregador(true);
        System.out.println(compra3.toString());
        compra3.emprestar();
        System.out.println(compra3.toString());
        compra3.devolver();
        System.out.println(compra3.toString());
        
        System.out.println("\n");
        
        FilialPatosLojaVirtual compra4 = new FilialPatosLojaVirtual();
        compra4.setDescricao("jaqueta");
        compra4.setValor(30.00);
        compra4.setDisponivel(true);
        compra4.setURL("www.lkjh.com");
        compra4.setStatusEntregador(false);
        System.out.println(compra4.toString());
        compra4.emprestar();
        System.out.println(compra4.toString());
        compra4.devolver();
        System.out.println(compra4.toString());
        
        
    }
    
}
