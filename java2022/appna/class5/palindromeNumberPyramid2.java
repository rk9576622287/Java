/* Print a palindromic number pyramid.
          1 
        2 1 2
      3 2 1 2 3 
    4 3 2 1 2 3 4   */
import java.util.Scanner;
public class palindromeNumberPyramid2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. od Row :");
		int n = sc.nextInt();
	    for(int i=1; i<=n; i++){
	        for(int j=1; j<=n-i; j++)
	            System.out.print("  ");
	        for(int j=i; j>=1; j--)
	            System.out.print(j+" ");
	        for(int j=2; j<=i; j++)
	            System.out.print(j+" ");
	        System.out.println();
	    }
	}
}
