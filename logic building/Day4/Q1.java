import java.lang.reflect.Array;
public class Q1{
	public static void main(String args[]){
		int arr[]={5,4,3,9,1,7,9},sum=0;
		int n = Array.getLength(arr);
		for( int i=0;i<n;i++)
			sum = sum + arr[i];
		int avg = sum / n;
		System.out.println("Average is : "+ avg);
		
}
}