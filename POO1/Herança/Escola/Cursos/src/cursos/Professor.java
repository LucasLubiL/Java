package cursos;

/**
 *
 * @author Lucas
 */
public class Professor extends UsuarioSistema{

    public Professor(int siape, String nucleo, String nome, String login, int senha, String email) {
        super(nome, login, senha, email);
        
        if(nucleo.equals("Informatica") || nucleo.equals("Eletrica") || nucleo.equals("Administracao")){
            this.nucleo=nucleo;
        }else{
            this.nucleo="Nao informado";
        }
        this.siape = siape;
        
    }
    
    private int siape;
    private String nucleo;

    public int getSiape() {
        return siape;
    }

    public String getNucleo() {
        return nucleo;
    }
    
    public void mostrarInformacoes(){
       
        System.out.println("Nome: " + getNome() + "; Login: " + getLogin() + "; Senha: " + getSenha() + "; Email: " + getEmail() + "; Siape: " + this.siape + "; Nucleo: " + this.nucleo + "\n");
    
    }
    
    
}
