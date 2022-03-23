import java.util.*;
public class checkAccendingOrder
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++){
		    arr[i] = sc.nextInt();
		}
		boolean check = true;
		for(int i=0; i<arr.length-1; i++){
		    if(arr[i] > arr[i+1]){
		        check = false;
		        break;
		     }
		}
		if(check)
		    System.out.println("yes");
		else
		    System.out.println("no");
	}
}
