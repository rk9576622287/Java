import java.util.Scanner;
public class 
{
    static void GCF(int n1, int n2){
        int f1, f2, max=1;
        int min_num = n1<n2 ? n1:n2;
        for(int i=2; i<=min_num; i++){
            if(n1%i == 0 && n2%i == 0)
                max=i;
        }
        System.out.println("GCF or HCF of number is :"+max);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number :");
		int n1 = sc.nextInt();
		System.out.print("Enter Second number :");
		int n2 = sc.nextInt();
		
		GCF(n1, n2);
	}
}
