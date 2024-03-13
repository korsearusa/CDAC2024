import java.util.Scanner;
class Grades{
    public static void main(String args[]){
        System.out.println("Enter grade:");
        Scanner sc= new Scanner(System.in);
        int grade= sc.nextInt();
        if(grade<0)
        System.out.println("Invalid grade");
        else{
            if(grade>=90)
                System.out.println("A+");
            else if(grade >=80 && grade <90)
                System.out.println("A");
            else if(grade >=70 && grade <80)
                System.out.println("B");
            else if(grade >=60 && grade <70)
                System.out.println("C");
            else if(grade >=50 && grade <60)
                System.out.println("D");
            else 
                System.out.println("F");
        }
    }
}