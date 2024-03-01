import java.util.Scanner;
public class Q5
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		boolean flag=false;
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

		for(int i=0;i<arr2.length;i++){
			for( int j=0;j<arr2[0].length;j++){
				if(arr1[i][j] != arr2[i][j])
					flag= true;
			}	
		}

		if(flag==true)
		System.out.println("Not equal");
		else
		System.out.println("equal");
	}
}