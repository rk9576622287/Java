//daimond sahpe
import java.util.Scanner;
public class daimondShape
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of Row :");;
		int n = sc.nextInt();
		for(int i=1; i<=n; i++){
		    for(int j=1; j<=n-i; j++)
		        System.out.print(" ");
		    for(int j=1; j<=(i*2)-1; j++)
		        System.out.print("*");
		    System.out.println();
		}
		for(int i=n; i>=1; i--){
		    for(int j=1; j<=n-i; j++)
		        System.out.print(" ");
		    for(int j=1; j<=(i*2)-1; j++)
		        System.out.print("*");
		    System.out.println();
		}
	}
}
