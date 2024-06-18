import java.util.Locale;
import java.util.Scanner;

public class ParConsecutivoBEECROWD1159
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, soma=0, cont=0;
		
		x= sc.nextInt();
		
		while(x!=0){
		    
		    soma=0;
		    cont=0;
		    
		    for(int i=x;i<=1000000;i++){
		        if(i%2==0){
		            soma=soma+i;
		            cont++;
		            if(cont==5){
		                break;
		            }
		        }
		        
		    }
		    
		    System.out.println(soma);
		    
		    x= sc.nextInt();
		    
		}
		
		sc.close();
	}
}