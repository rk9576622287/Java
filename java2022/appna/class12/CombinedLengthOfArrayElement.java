// combined length of  string array element 
import java.util.Scanner;
public class CombinedLengthOfArrayElement
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Size of array :");
	    int size = sc.nextInt();
	    System.out.println("Enter All "+ size +" elements");
	    String arr[] = new String[size];
	    for(int i=0; i<size; i++){
	        arr[i] = sc.next();
	    }
	    //System.out.println(arr[1]);
	    int mylength=0;
	    for(int i=0; i<size; i++){
	        mylength+=arr[i].length();
	    }
	    System.out.println("Total Length is :"+ mylength);
	}
}
