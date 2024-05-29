import java.util.Scanner;
 
public class SeqLógicaBEECROWD1144
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n,mult,cubo;
	    
	    n = sc.nextInt();
	    
	    for(int i=1;i<=n;i++){
	        mult=i*i;
	        cubo=i*mult;
	        int um = mult+1;
	        int dois = cubo+1;
	        System.out.println(i + " " + mult + " " + cubo);
	        System.out.println(i + " " + um + " " + dois);
	    }
	    
	    sc.close();
	    
	}
}