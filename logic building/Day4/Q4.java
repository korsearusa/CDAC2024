import java.util.Scanner;
public class Q4
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int arr1[][]=new int[3][3];
		System.out.println("Enter matrix one");
		for(int i=0;i<arr1.length;i++){
			for( int j=0;j<arr1[0].length;j++){
				arr1[i][j]=sc.nextInt();				
			}
		}
		int arr2[][]=new int[3][3];
		System.out.println("Enter matrix two");
		for(int i=0;i<arr2.length;i++){
			for( int j=0;j<arr2[0].length;j++){
				arr2[i][j]=sc.nextInt();				
			}
		}
		int arr3[][]=new int[3][3];
		for(int i=0;i<arr2.length;i++){
			for( int j=0;j<arr2[0].length;j++){
				arr3[i][j]=arr1[i][j]+arr2[i][j];				
			}
		}
		
		System.out.println("Sum of two matrices is");
		for(int i=0;i<arr3.length;i++){
			for( int j=0;j<arr3[0].length;j++){
				System.out.print(arr3[i][j]+" ");	

			}
			System.out.println();
		}
	}
}