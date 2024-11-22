package aluno;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Aluno {
    
    private String nome;
    private String cidade;
    private String instituição;
    private String curso;

    public Aluno(){}
    
    public Aluno(String nome, String cidade, String instituição, String curso) {
        this.nome = nome;
        this.cidade = cidade;
        this.instituição = instituição;
        if(curso.equals("ADS") || curso.equals("EE")){
            this.curso = curso;
        }else{
            this.curso = "ADS";
        }       
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getInstituição() {
        return instituição;
    }

    public void setInstituição(String instituição) {
        this.instituição = instituição;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
         if(curso.equals("ADS") || curso.equals("EE")){
            this.curso = curso;
        }else{
            this.curso = "ADS";
        }
    }
    
    
    
}
