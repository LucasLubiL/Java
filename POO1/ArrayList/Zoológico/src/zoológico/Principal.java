package zoológico;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Principal {

    public static void main(String[] args) {
        
        Zoologico zoologico = new Zoologico();
        
        ArrayList<String> mamifero = new ArrayList();
        mamifero.add("Leao");
        mamifero.add("Elefante");
        mamifero.add("Tigre");
        mamifero.add("Gorila");
        mamifero.add("Urso");
        zoologico.setMamiferos(mamifero);
        
        ArrayList<String> ave = new ArrayList();
        ave.add("Aguia");
        ave.add("Papagaio");
        ave.add("Pinguim");
        ave.add("Falcao");
        ave.add("Corvo");
        zoologico.setAves(ave);
        
        ArrayList<String> peixe = new ArrayList();
        peixe.add("Tubarao");
        peixe.add("Salmao");
        peixe.add("Dourado");
        peixe.add("Betta");
        peixe.add("Sardinha");
        zoologico.setPeixes(peixe);
        
        int total = zoologico.getMamiferos().size() + zoologico.getAves().size() + zoologico.getPeixes().size();
        
        System.out.println("No Zoologico tem " + total + " animais");
        
        System.out.println("\n///////////////////////////////////////////////////////////\n");
        
        System.out.println("Mamiferos:");
        for(String mamiferos : zoologico.getMamiferos()){
        
            System.out.println(mamiferos);
            
        }
        
        System.out.println("\nAves:");
        for(String aves : zoologico.getAves()){
        
            System.out.println(aves);
            
        }
        
        System.out.println("\nPeixes:");
        for(String peixes : zoologico.getPeixes()){
        
            System.out.println(peixes);
            
        }
        
        System.out.println("\n///////////////////////////////////////////////////////////\n");
        
        System.out.println("Aves: " + ave.get(0) + ", " + ave.get(1) + " Foram eliminadas");
        ave.remove(0);
        ave.remove(1);
        
        System.out.println("\n///////////////////////////////////////////////////////////\n");
        
        System.out.println("\nAves após a exclusao:");
        for(String aves : zoologico.getAves()){
        
            System.out.println(aves);
            
        }
        
        System.out.println("\n///////////////////////////////////////////////////////////\n");
        
        boolean teste = ave.contains("Pelicano");
        if(teste){
            System.out.println("A ave contem na lista");
        }else{
            System.out.println("Pelicano acaba de ser colcoado na lista\nSegue abaixo a lista atualizada:");
            ave.add("Pelicano");
            zoologico.setAves(ave);
            
            for(String aves : zoologico.getAves()){
        
                System.out.println(aves);
            
            }
        }
        
    }
    
}
