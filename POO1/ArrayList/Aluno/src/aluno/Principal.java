package aluno;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Principal {

    public static void main(String[] args) {
        
        Aluno lucas = new Aluno();
        lucas.setNome("Lucas Amaral");
        lucas.setCidade("Patrocinio");
        lucas.setInstituição("IFTM");
        lucas.setCurso("ADS");
        
        Aluno maria = new Aluno();
        maria.setNome("Maria");
        maria.setCidade("Patrocinio");
        maria.setInstituição("IFTM");
        maria.setCurso("ADS");
        
        Aluno pietra = new Aluno();
        pietra.setNome("Pietra");
        pietra.setCidade("Patrocinio");
        pietra.setInstituição("IFTM");
        pietra.setCurso("ADS");
        
        Aluno joao = new Aluno();
        joao.setNome("Joao");
        joao.setCidade("Patrocinio");
        joao.setInstituição("IFTM");
        joao.setCurso("EE");
        
        Aluno carlos = new Aluno();
        carlos.setNome("Carlos");
        carlos.setCidade("Patrocinio");
        carlos.setInstituição("IFTM");
        carlos.setCurso("EE");
        
        Aluno suelen = new Aluno();
        suelen.setNome("Suelen");
        suelen.setCidade("Patrocinio");
        suelen.setInstituição("IFTM");
        suelen.setCurso("AAAds");
        
        ArrayList<Aluno> ADS = new ArrayList<>();
        ArrayList<Aluno> EE = new ArrayList<>();
        
        ArrayList<Aluno> aluno = new ArrayList<>();
        aluno.add(lucas);
        aluno.add(maria);
        aluno.add(pietra);
        aluno.add(joao);
        aluno.add(carlos);
        aluno.add(suelen);
        
        for(Aluno aux : aluno){
            if(aux.getCurso().equals("ADS")){
               ADS.add(aux);
            }else{
               EE.add(aux);
            }
        }
        
        System.out.println("Estudantes de ADS: " + ADS.size());
        System.out.println("Estudantes de EE: " + EE.size());
        
        System.out.println("\n///////////////////////////////////////////////////////////\n");
        
        System.out.println("Alunos de ADS:");
        for(Aluno aux : ADS){
            System.out.print("Nome: " + aux.getNome());
            System.out.println("; Cidade: " + aux.getCidade());
        }
        
        System.out.println("\n///////////////////////////////////////////////////////////\n");
        
        System.out.println("Alunos de EE:");
        for(Aluno aux : EE){
            System.out.print("Nome: " + aux.getNome());
            System.out.println("; Cidade: " + aux.getCidade());
        }
        
    }
    
}
