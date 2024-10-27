package produto;

/**
 *
 * @author Lucas
 */
public class Principal {

    public static void main(String[] args) {
        
        Produto prod = new Produto();
        prod.setNome("Celular");
        prod.setCategoria("Eletronico");
        prod.setPreco(2500.00);
        prod.setQuantidadeEmEstoque(5);
        System.out.println("Produto: " + prod.getNome());
        System.out.println("Categoria: " + prod.getCategoria());
        System.out.println("Preco: R$" + prod.getPreco());
        System.out.println("Estoque: " + prod.getQuantidadeEmEstoque() + "\n");
        
        Produto prod2 = new Produto();
        prod2.setNome("Boneca");
        prod2.setCategoria("Infantil");
        prod2.setPreco(-10);
        prod2.setQuantidadeEmEstoque(-3);
        System.out.println("Produto: " + prod2.getNome());
        System.out.println("Categoria: " + prod2.getCategoria());
        System.out.println("Preco: R$" + prod2.getPreco());
        System.out.println("Estoque: " + prod2.getQuantidadeEmEstoque() + "\n");
        
        Produto prod3 = new Produto();
        prod3.setNome("Liquidificador");
        prod3.setCategoria("Eletrodomestico");
        prod3.setPreco(300.0);
        prod3.setQuantidadeEmEstoque(15);
        System.out.println("Produto: " + prod3.getNome());
        System.out.println("Categoria: " + prod3.getCategoria());
        System.out.println("Preco: R$" + prod3.getPreco());
        System.out.println("Estoque: " + prod3.getQuantidadeEmEstoque() + "\n");
       
    }
    
}
