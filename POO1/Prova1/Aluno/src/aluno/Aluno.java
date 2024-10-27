package aluno;

/**
 *
 * @author Lucas
 */
public class Aluno {
    
    private String nome;
    private int idade;
    private double nota;
    private String matricula;
    
    public Aluno(){}

    public Aluno(String nome, int idade, double nota, String matricula) {
        this.nome = nome;
        
        if(idade<18 || idade>90){
           this.idade = 18;
        }else{
           this.idade = idade;
        }
        
        if(nota<0.0 || nota >10.0){
           this.nota = 0.0;
        }else{
           this.nota = nota;
        }
       
        this.matricula = matricula;
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
        if(idade<18 || idade>90){
            this.idade=18;
        }else{
            this.idade = idade;
        }
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if(nota<0.0 || nota>10.0){
           this.nota=0.0;
        }else{
           this.nota = nota;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
