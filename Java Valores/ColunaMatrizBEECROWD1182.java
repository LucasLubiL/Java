import java.util.Locale;
import java.util.Scanner;

public class ColunaMatrizBEECROWD1182
{
	public static void main(String[] args) {
	    
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double[][] ma= new double[12][12];
		int s;
		double soma=0;
		double media=0;
		char b;
		
		s=sc.nextInt();
		b=sc.next().charAt(0);
		
		for(int l=0; l<12; l++){
		    for(int c=0; c<12; c++){
		        ma[l][c]=sc.nextDouble();
		    }
		}
		
		for(int l=0; l<12; l++){
		    for(int c=0; c<12; c++){
		        if(c==s){
		           soma=soma+ma[l][c];
		        }
		    }
		}
		
		if(b=='S'){
		    System.out.println(soma);
		}else{
		    media=(double)soma/12;
		    System.out.println(String.format("%.1f",media));
		}
		
		sc.close();
		
	}
}