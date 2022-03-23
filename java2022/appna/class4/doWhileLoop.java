// use of do while loop  */
import java.util.Scanner;
class doWhileLoop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=1,marks=0;
		do{
			System.out.print("Enter Choice 0 or 1 :");
			choice = sc.nextInt();
			if(choice==1){
				System.out.print("Enter your marks(out of 100) :");
				marks = sc.nextInt();
				if(marks >= 90)
					System.out.println("This is Good");
				else if(marks >=60 && marks <=89)
					System.out.println("This is also Good");
				else if(marks >=45 && marks <= 59)
					System.out.println("This is Good as well");
				else
					System.out.println("Marks is very low");
			}
			else{
				break;
			}
		}while(choice==1);
		
	}
}