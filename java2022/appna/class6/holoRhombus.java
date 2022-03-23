// print holo Rhombus
import java.util.Scanner;
public class holoRhombus
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of Row :");;
		int n = sc.nextInt();
		for(int i=1; i<=n; i++){
		    for(int j=1; j<=n-i; j++)
		        System.out.print(" ");
		    for(int j=1; j<=n; j++){
		        if(i==1 || i==n )
		            System.out.print("*");
		        else if(i>=1 && i<=n){
		            if(j==1 || j==n)
		                System.out.print("*");
		            else    
		                System.out.print(" ");
		        }
		    }
		        
		    System.out.println();
		}
	}
}
