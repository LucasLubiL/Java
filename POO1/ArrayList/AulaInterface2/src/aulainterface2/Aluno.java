package aulainterface2;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Aluno implements DAO{

    private String nome;
    private String RA;
    private String curso;

    @Override
    public void salvar(ArrayList dados) {
        for(Object aux : dados){
            
            System.out.println("Dado salvo: " + aux);
            System.out.println("*****************");
        }
    }

    @Override
    public ArrayList selecionar(ArrayList dados) {
        
        System.out.println("Dados selecionados:");
        return dados;
    }

    @Override
    public void deletar(int chavePrimaria, String rotulo) {
        System.out.println("Registro " + chavePrimaria + " " + rotulo + " excluido com sucesso!");
    }

    @Override
    public void alterar(String dados) {
        System.out.println("Registro alterado: " + dados);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString(){
    
        return "Nome: " + getNome() + "; Curso: " + getCurso() + "; RA: " + getRA();
    }
    
    
}
