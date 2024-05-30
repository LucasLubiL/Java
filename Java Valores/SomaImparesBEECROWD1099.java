import java.util.Scanner;
import java.util.Locale;

public class SomaImparesBEECROWD1099
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x,a,b,maior,soma=0;
		
		x = sc.nextInt();
		
		for(int i=0;i<x;i++){
		    soma=0;
		    a = sc.nextInt();
		    b = sc.nextInt();
		    
		    maior=a;
		    
		    if(a>b){
		        a=b;
		        b=maior;
		    }
		    
		    for(int j=a+1;j<b;j++){
		        if(j%2!=0){
		            soma=soma+j;
		        }
		    }
		    
		    System.out.println(soma);
		    
		}
		
		sc.close();
		
	}
}
