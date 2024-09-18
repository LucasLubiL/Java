package aulapoo2;

/**
 *
 * @author IFTM
 */
public class Principal {

    public static void main(String[] args) {
        
        Empregado maria = new Empregado();
        maria.nome = "Maria Benedita";
        maria.endereco = "Rua Jotabá, 33, Centro";
        maria.funcao = "Supervisora de loja";
        maria.salario = 9000.00;
        
        String aux = maria.verificarNomeFuncao();
        System.out.println(aux);
        
        if(maria.verificarSalario()){
            System.out.println("Salario de " + maria.nome + "é: R$" + maria.salario);
        }else{
            System.out.println("Salario inexistente.");
        }
        
        Empregado2 jose = new Empregado2();
        maria.nome = "João Badista";
        maria.endereco = "Rua Otávio, 44, Centro";
        maria.funcao = "Gerente de TI";
        maria.salario = 10000.00;
        
        String aux2 = jose.verificarNomeFuncao();
        System.out.println(aux2);
        
        if(jose.verificarSalario()){
            System.out.println("Salario de " + jose.nome + "é: R$" + jose.salario);
        }else{
            System.out.println("Salario inexistente.");
        }
        
    }
    
}
