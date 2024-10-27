package cursos;

/**
 *
 * @author Lucas
 */
public class Coordenador extends UsuarioSistema{
    
    private String curso;
    private int senhaMplan;

    public Coordenador(String curso, int senhaMplan, String nome, String login, int senha, String email) {
        super(nome, login, senha, email);
        this.curso = curso;
        this.senhaMplan = senhaMplan;
    }
    
    public String getCurso() {
        return curso;
    }

    public int getSenhaMplan() {
        return senhaMplan;
    }
    
    public void mostrarInformacoes(){
       
        System.out.println("Nome: " + getNome() + "; Login: " + getLogin() + "; Senha: " + getSenha() + "; Email: " + getEmail() + "; Curso: " + this.curso + "; SenhaMplan: " + this.senhaMplan + "\n");
    
    }
    
}
