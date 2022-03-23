 import java.util.Scanner;
 public class transposeMatrix 
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number row and column :");
	    int row = sc.nextInt();
	    int col = sc.nextInt();
		int[][] arr = new int[row][col];
		
		System.out.println("Enter data in matrix ");
		for(int i=0; i<row; i++){
		    for(int j=0; j<col; j++){
		        System.out.print("Enter data in arr["+ i +"]["+ j +"] :");
		        arr[i][j] = sc.nextInt();
		    }
		}
		
		System.out.println("2D array element is");
		for(int i=0; i<row; i++){
		    for(int j=0; j<col; j++){
		        System.out.print(arr[i][j] +" ");
		    }
		    System.out.println();
		}

		System.out.println("Transpose of matrix is ");
		for(int j=0; j<col; j++){
		    for(int i=0; i<row; i++){
		        System.out.print(arr[i][j] +" ");
		    }
		    System.out.println();
		}
	}
}
