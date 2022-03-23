import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Length of array :");
	    int size = sc.nextInt();
		int[] arr1 = new int[size];
		for(int i=0; i<size; i++){
		    System.out.print("Enter array value of "+ i +" index :");
		    arr1[i] = sc.nextInt();
		}
		 System.out.println("\nYour array value is :");
	    for(int i=0; i<size; i++){
	        System.out.print(arr1[i] +" ");
	    }
	    int ch=1;
	    while(ch==1){
	        int found=0;
	        System.out.print("\nEnter value to search :");
	        int search = sc.nextInt();
	        //Arrays.sort(arr1);
	        //arr1.length();
	        for(int i=0; i<size; i++){
	            if(arr1[i] == search){
	                found++;
	                System.out.println("value "+ search +" is found at index "+ i);
	                break;
	            }
	        }
	        if(found==0)
	            System.out.println("Value "+ search +" is not found !! ");
	        System.out.print("Enter 1 for next and 0 for exit :");
	        ch = sc.nextInt();
	    }
	    System.out.println("\nProgram exit THANK YOU 🙏");
	}
}
