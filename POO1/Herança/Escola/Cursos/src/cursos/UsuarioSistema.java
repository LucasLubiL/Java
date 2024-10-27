package cursos;

/**
 *
 * @author Lucas
 */
public class UsuarioSistema {
    
    private String nome;
    private String login;
    private int senha;
    private String email;

    public UsuarioSistema(String nome, String login, int senha, String email) {
        if(senha<=0){
            this.senha=123;
        }else{
            this.senha=senha;
        }
        
        if(login.equals("")){
            this.login="admin";
        }else{
            this.login = login;
        }
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void mostrarInformacoes(){
       
        System.out.println("Nome: " + this.nome + "; Login: " + this.email + "; Senha: " + this.senha + "; Email: " + this.email + "\n");
    
    }
    
}
