/* print solid  full rhombus 
           * * * * * * 
             * * * * * *
               * * * * * *
                 * * * * * *
               * * * * * * 
             * * * * * *
           * * * * * *          */
import java.util.Scanner;
public class fullRhombus1{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row :");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
             for(int j=1; j<=n; j++)
                System.out.print("* ");
            System.out.println();
            if(i!=n){
                for(int j=1; j<=i; j++)
                    System.out.print("  ");
            }
        }

        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=n-i-1; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}