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
    
    public String verificarIdade(){
    
        if(this.idade<18){
           return "Vc e de menor";
        }else{
           return "Vc e de maior";  
        }
    }

    public Idade(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
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
