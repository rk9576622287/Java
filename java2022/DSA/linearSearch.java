import java.util.Scanner;
public class linearSearch{
    public static int linearSearch(int arr[], int value, int len){
        for(int i=0; i<len; i++){
            if(arr[i]==value)
                return i;
        }
        return -1;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter value to search :");
        int value = sc.nextInt();
        int len = arr.length;
        int result = linearSearch(arr,value, len);
        if(result == -1)
            System.out.println("Not Found");
        else
            System.out.println("found at index :"+ result);
    }
}