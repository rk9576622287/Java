/* print all even numnber till n */
import java.util.Scanner;
class evenNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of N'th value :");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++){
			if(i % 2 == 0){
				System.out.print(i+" ");
			}
		}
	}
}