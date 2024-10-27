package cursos;

/**
 *
 * @author Lucas
 */
public class Principal {

    public static void main(String[] args) {
       
        UsuarioSistema usuario = new UsuarioSistema("Joao", "joao123", 789456, "joao123@gmail.com");
        usuario.mostrarInformacoes();
        
        Coordenador cord = new Coordenador("ADS", 100, "Ligia", "" , 123455, "cord.com.br" );
        cord.mostrarInformacoes();
        
        Aluno estudante = new Aluno(987, "Java", "Lucas", "lucas123", 0, "lucas123@gmail.com");
        estudante.mostrarInformacoes();
        
        Professor prof = new Professor(321, "CH98", "Pedro", "pedro123", 56478, "pedro123@gmail.com");
        prof.mostrarInformacoes();
    
    }   
}
