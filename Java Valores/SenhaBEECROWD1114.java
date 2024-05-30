import java.util.Scanner;
import java.util.Locale;

public class SenhaBEECROWD1114
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
	
	    x = sc.nextInt();
	    
	    while(x!=2002){
	        System.out.println("Senha Invalida");
	        x = sc.nextInt();
	    }
	    
	    System.out.println("Acesso Permitido");
		
		sc.close();
		
	}
}