import java.util.Locale;
import java.util.Scanner;

public class AnimalBEECROWD1049 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String tipo,um,dois;

        tipo=sc.nextLine();
        um=sc.nextLine();
        dois=sc.nextLine();

        if(tipo.equals("vertebrado")){
            if(um.equals("ave")){
               if(dois.equals("carnivoro")){
                  
                  System.out.println("aguia");
               }else{
                  
                  System.out.println("pomba");
               }
            }else if(um.equals("mamifero")){
                if(dois.equals("onivoro")){
                    
                    System.out.println("homem");
                 }else{
                    
                    System.out.println("vaca");
                 }
            }
            
        }else if(tipo.equals("invertebrado")){
            if(um.equals("inseto")){
                if(dois.equals("hematofago")){
                   
                   System.out.println("pulga");
                }else{
                   
                   System.out.println("lagarta");
                }
            }else if(um.equals("anelideo")){
                 if(dois.equals("onivoro")){
                     System.out.println("minhoca");
                  }else{
                     
                     System.out.println("sanguessuga");
                  }
            }
             
        }
        sc.close();
    }
    
}