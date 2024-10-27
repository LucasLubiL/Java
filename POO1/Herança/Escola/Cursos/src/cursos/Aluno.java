package cursos;

/**
 *
 * @author Lucas
 */
public class Aluno extends UsuarioSistema{

    public Aluno(int RA, String disciplinas, String nome, String login, int senha, String email) {
        super(nome, login, senha, email);
        this.RA = RA;
        this.disciplinas = disciplinas;
    }
    
    private int RA;
    private String disciplinas;

    public int getRA() {
        return RA;
    }

    public String getDisciplinas() {
        return disciplinas;
    }
    
    public void mostrarInformacoes(){
       
       System.out.println("Nome: " + getNome() + "; Login: " + getLogin() + "; Senha: " + getSenha() + "; Email: " + getEmail() + "; RA: " + this.RA + "; Disciplina(s): " + this.disciplinas + "\n");
    
    }
    
    
    
}
