import java.util.*;
class Cal{
    public static void main(String args[]){
        System.out.println("Enter number1:");
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        System.out.println("Enter number2:");
        int n2= sc.nextInt();
        System.out.println("Enter operator:");
        char c = sc.next().charAt(0);

        switch(c){
        case '+':
            System.out.println(n1+n2);
            break;
        case '-':
            System.out.println(n1-n2);
            break;
        case '/':
            System.out.println(n1/n2);
            break;
        case '*':
            System.out.println(n1*n2);
            break;
        default:
            System.out.println("Invalid Operation");
        }
    }
}