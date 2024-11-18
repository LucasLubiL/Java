package aulaarraylist;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class PrincipalAluno {
    
    public static void main(String args[]){
    
        Aluno ian = new Aluno();
        ian.setNome("Ian");
        ian.setSobrenome("LALA");
        ian.setCurso("ADS");
        ian.setRA("112233-99");
        ian.setAnoIngresso(2023);
        ian.setPrevisaoTermino(2026);
        
        Aluno lucas = new Aluno();
        lucas.setNome("Lucas");
        lucas.setSobrenome("Amaral");
        lucas.setCurso("ADS");
        lucas.setRA("99887766-55");
        lucas.setAnoIngresso(2023);
        lucas.setPrevisaoTermino(2026);
        
        Aluno jose = new Aluno();
        jose.setNome("Jose");
        jose.setSobrenome("Luciano");
        jose.setCurso("ADS");
        jose.setRA("44553388-10");
        jose.setAnoIngresso(2023);
        jose.setPrevisaoTermino(2026);
        
        ArrayList<Aluno> lista = new ArrayList();
        lista.add(ian);
        lista.add(lucas);
        lista.add(jose);
        
        for(Aluno aux : lista){
            System.out.println("Nome e sobrenome: " + aux.getNome() + " " + aux.getSobrenome());
            System.out.println("Curso: " + aux.getCurso());
            System.out.println("RA: " + aux.getRA());
            System.out.println("Ano de Ingresso: " + aux.getAnoIngresso());
            System.out.println("Previsao Termino: " + aux.getPrevisaoTermino());
            System.out.println("\n///////////////////////////////////////////////////////////////////\n");
        }
        
    }
    
}
