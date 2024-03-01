import java.lang.reflect.Array;
public class Q2{
	public static void main(String args[]){
		int arr[]={5,4,3,9,1,7,9},min=arr[0],max=arr[0];
		int n = Array.getLength(arr);
		for( int i=1;i<n;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Max is : "+max);
		System.out.println("Min is : "+min);		
		
}
}