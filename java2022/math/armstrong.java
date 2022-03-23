import java.util.Scanner;
public class armstrong
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = sc.nextInt();
        int temp = num;
        int len=0,d;
        while(temp>0){
            len++;
            temp = temp/10;
        }
        System.out.println(len);
        double check=0;
        temp=num;
        while(temp>0){
            d=temp%10;
            check += Math.pow(d,len);
            temp = temp/10;
        }
        System.out.println((int)check);
	}
}