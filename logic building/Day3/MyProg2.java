import java.util.*;
public class MyProg2{
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Simple Calculator");
	System.out.println("-----------------");
	System.out.println("Enter first number");
       int n1 = sc.nextInt();
	System.out.println("Enter second number");
       int n2 = sc.nextInt();
   	System.out.println("Choose an operation: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\nEnter your choice: ");
	int choice= sc.nextInt();
	int result;
        switch (choice){
            case 1:
		result=n1+n2;
                System.out.println("Result:"+n1+" + "+n2+" = "+result);
                break;
	   case 2:
		result=n1-n2;
                System.out.println("Result:"+n1+" - "+n2+" = "+result);
                break;
	   case 3:
		result=n1*n2;
                System.out.println("Result:"+n1+" * "+n2+" = "+result);
                break;
	   case 4:
		result=n1/n2;
                System.out.println("Result:"+n1+" / "+n2+" = "+result);
                break;
	   default:
                System.out.println("Error: Invalid input");
                
    }
}
}
 
