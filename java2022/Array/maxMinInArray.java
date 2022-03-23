// find the maximum and minimum value in an array of n length.
import java.util.Scanner;
public class maxMinInArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
		    arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int i=1; i<arr.length; i++){
		    if(max<arr[i])
		        max = arr[i];
		    if(min > arr[i])
		        min = arr[i];
		}
		System.out.println("maxmum value is "+ max +" and minimum value is "+ min);
	}
}