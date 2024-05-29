import java.util.Scanner;

public class PumBEECROWD1142
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n,aux=1,cont=0,conta,m;
		int[] ve = new int[3];
		
		n = sc.nextInt();
		
		conta=n*3;
		
		for(int i=0;i<n;i++){
		    cont=0;
		    m=0;
		    for(int j=aux;j<conta;j++){
		        cont++;
		        ve[m]=j;
		        m++;
		        if(cont==3){
		            aux=j+2;
		            conta=conta+2;
		            System.out.println(ve[0] + " " + ve[1] + " " + ve[2] + " PUM");
		            break;
		        }
		    }
		}
		
		sc.close();
	}
}