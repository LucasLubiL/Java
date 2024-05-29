import java.util.Scanner;

public class GrenaisBEECROWD1131
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inter=0,gremio=0,empate=0,um,dois;
		int grenal=0,op=0;
		
		while(op!=2){
		
		   um = sc.nextInt();
	       dois = sc.nextInt();
	       
	       if(um>dois){
	           inter++;
	       }else if(dois>um){
	           gremio++;
	       }else{
	           empate++;
	       }
		   
		   System.out.println("Novo grenal (1-sim 2-nao)");
		   grenal++;
		   op = sc.nextInt();
		
		}
		
		System.out.println(grenal + " grenais");
		System.out.println("Inter:" + inter);
		System.out.println("Gremio:" + gremio);
		System.out.println("Empates:" + empate);
		
		if(inter>gremio){
		    System.out.println("Inter venceu mais");
		}else if(gremio>inter){
		    System.out.println("Gremio venceu mais");
		}else{
		    System.out.println("Nao houve vencedor");
		}
		
		
		
		sc.close();
	}
}