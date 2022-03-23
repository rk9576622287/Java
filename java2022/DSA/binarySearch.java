import java.util.Scanner;
public class binarySearch{
    public  static int binarySearch(int arr[], int Value, int low, int high){
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==Value)
                return mid;
            else if(arr[mid]<Value)
                low=mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :"); 
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter Value to search :");
        int Value = sc.nextInt();
        int result = binarySearch(arr, Value, 0, size-1);
        if(result==-1)
            System.out.println("Not Found");
        else    
            System.out.println("Found at index "+ result);
    }
}