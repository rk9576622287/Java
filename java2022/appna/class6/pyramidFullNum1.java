//Print full number Pyramid.
import java.util.Scanner;
public class pyramidFullNum1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of Row :");;
		int n = sc.nextInt();
	    for(int i=1; i<=n; i++){
	        for(int j=1; j<=n-i; j++)
	            System.out.print(" ");
	       for(int j=1; j<=i; j++)
	            System.out.print(j + " ");
	       System.out.println();
	    }
	}
}
