package pessoa;

/**
 *
 * @author Lucas
 */
public class Pessoa {
    
    private int codigo;
    private String nome;
    private String Cadastro;

    public Pessoa() {
    }

    public Pessoa(int codigo, String nome, String Cadastro) {
        this.codigo = codigo;
        this.nome = nome;
        this.Cadastro = Cadastro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCadastro() {
        return Cadastro;
    }

    public void setCadastro(String Cadastro) {
        this.Cadastro = Cadastro;
    }
    
    
    
}
