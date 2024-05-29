import java.util.Scanner;

public class Multiplos13BEECROWD1132
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x,y,aux,soma=0;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
	
		if(y<x){
		    aux=x;
		    x=y;
		    y=aux;
		}
		
		for(int i=x;i<=y;i++){
		    if(i%13!=0){
		        soma = soma + i;
		    }
		}
		
		System.out.println(soma);
		
		
		sc.close();
	}
}