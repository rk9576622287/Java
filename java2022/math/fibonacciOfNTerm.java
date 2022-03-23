// program to print Fibonacci series of n term 
import java.util.Scanner;
public class fibonacciOfNTerm
{
    static void fibonacci(int n){
        int a=0,b=1,c=0;
        System.out.print(a + " " + b + " ");
        for(int i=2; i<n; i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of term :");
		int n1 = sc.nextInt();
		
		fibonacci(n1);
	}
}
