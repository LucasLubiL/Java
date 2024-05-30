import java.util.Scanner;
import java.util.Locale;

public class CresDecresBEECROWD1113
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x,y;
	
	    x = sc.nextInt();
	    y = sc.nextInt();
	    
	    while(x!=y){
	        if(x<y){
	            System.out.println("Crescente");
	        }else{
	            System.out.println("Decrescente");
	        }
	        
	       x = sc.nextInt();
	       y = sc.nextInt();
	       
	    }
	    
		sc.close();
		
	}
}