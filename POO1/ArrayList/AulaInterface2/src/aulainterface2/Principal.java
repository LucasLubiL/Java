package aulainterface2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Principal {

   
    public static void main(String[] args) {
        
        ArrayList dados = new ArrayList();
        
        Scanner ler = new Scanner(System.in);
        String nome = ler.nextLine();
        
        System.out.println("Nome: " + nome);
        
        Aluno ian = new Aluno();
        Aluno ph = new Aluno();
        Aluno pablo = new Aluno();
        
        System.out.println("Insira o nome do aluno: ");
        ian.setNome(ler.next());
        System.out.println("Insira o curso do aluno: ");
        ian.setCurso(ler.next());
        System.out.println("Insira o RA do aluno: ");
        ian.setRA(ler.next());
        
        System.out.println("Insira o nome do aluno: ");
        ph.setNome(ler.next());
        System.out.println("Insira o curso do aluno: ");
        ph.setCurso(ler.next());
        System.out.println("Insira o RA do aluno: ");
        ph.setRA(ler.next());
        
        System.out.println("Insira o nome do aluno: ");
        pablo.setNome(ler.next());
        System.out.println("Insira o curso do aluno: ");
        pablo.setCurso(ler.next());
        System.out.println("Insira o RA do aluno: ");
        pablo.setRA(ler.next());
        
        dados.add(ian);
        dados.add(ph);
        dados.add(pablo);
        
        Aluno dao = new Aluno();
        dao.salvar(dados);
        dao.alterar(pablo.getRA());
        dao.deletar(10 ,ph.getNome());
        ArrayList mostrar = new ArrayList();
        mostrar = dao.selecionar(dados);
        
        for(Object aux : mostrar){
            System.out.println(aux.toString());
        }
        
    }
    
}
