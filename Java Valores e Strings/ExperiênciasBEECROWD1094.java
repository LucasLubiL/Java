import java.util.Scanner;
import java.util.Locale;

public class ExperiênciasBEECROWD1094
{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int x,soma=0;
		int C=0,R=0,S=0;
		char T;
		double c,r,s;
		
		n = sc.nextInt();
		
		for(int i=0;i<n;i++){
		    
		    x = sc.nextInt();
		    T = sc.next().charAt(0);
		    
		    if(T=='C'){
		        C=C+x;
		        soma=soma+x;
		    }else if(T=='R'){
		        R=R+x;
		        soma=soma+x;
		    }else if(T=='S'){
		        S=S+x;
		        soma=soma+x;
		    }
		    
		}
		
		c=((double)C/soma)*100;
		r=((double)R/soma)*100;
		s=((double)S/soma)*100;
		
		System.out.println("Total: " + soma + " cobaias");
		System.out.println("Total de coelhos: " + C);
		System.out.println("Total de ratos: " + R);
		System.out.println("Total de sapos: " + S);
		System.out.println("Percentual de coelhos: " + String.format("%.2f",c) + " %");
		System.out.println("Percentual de ratos: " + String.format("%.2f",r) + " %");
		System.out.println("Percentual de sapos: " + String.format("%.2f",s) + " %");
		
		sc.close();
		
	}
}