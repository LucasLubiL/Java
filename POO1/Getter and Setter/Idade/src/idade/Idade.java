package idade;

/**
 *
 * @author User
 */
public class Idade {
    
    private String nome;
    private int idade;
    private char sexo;
    
    public Idade(){};
    
    public String verificarIdade(int idade){
    
        if(idade<18){
            String fim = "Vc tem menos que 18 anos";
            return fim;
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    
}
