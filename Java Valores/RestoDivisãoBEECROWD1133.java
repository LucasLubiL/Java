import java.util.Scanner;
import java.util.Locale;

public class RestoDivisãoBEECROWD1133
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x , y, maior , menor;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		maior=x;
		menor=y;
		
		if(maior<y){
		    maior=y;
		    menor=x;
		}
		
		for(int i = menor+1; i<maior;i++){
		    if(i%5==2 || i%5==3){
		        System.out.println(i);
		    }
		}
		
		sc.close();
		
	}
}