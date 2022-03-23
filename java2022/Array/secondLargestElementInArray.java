import java.util.*;
class secondLargestElementInArray
{
    static void function(int arr[], int len)
    {
        Arrays.sort(arr);
        System.out.println(arr[len-2]);
    }

    public static void main(String[] args)
    {
        int arr[]={99,7,45,34,75,89,42,56,34};
        int arr_size = arr.length;
        function(arr, arr_size);
    }
}