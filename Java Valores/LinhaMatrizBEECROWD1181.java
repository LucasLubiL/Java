import java.util.Locale;
import java.util.Scanner;

public class LinhaMatrizBEECROWD1181
{
	public static void main(String[] args) {
	    
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    double[][] matriz=new double[12][12];
	    double soma=0;
	    double media=0;
	    int linha;
	    char qual;
	    
	    linha=sc.nextInt();
	    qual=sc.next().charAt(0);
	    
	    for(int l = 0 ; l<12; l++){
	        for(int c = 0; c<12; c++){
	            matriz[l][c]=sc.nextDouble();
	            if(l==linha){
	                soma=soma+matriz[l][c];
	                media=(double)soma/12;
	            }
	        }
	    }
	    
	    if(qual=='S'){
	        System.out.println(soma);
	    }else if(qual=='M'){
	        System.out.println(String.format("%.1f",media));
	    }

        sc.close();
	}		
}