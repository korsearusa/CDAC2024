import java.util.Scanner;
public class bmi{
    public static void main(String args[]){
        System.out.println("Enter height in meters:");
        Scanner sc= new Scanner(System.in);
        float height = sc.nextFloat();
        float height_square =height*height;
        System.out.println("Enter weight in kg:");
        float weight = sc.nextFloat();
        double bmi = weight / height_square;
        if (bmi>0 && bmi <= 18.5)
            System.out.println("Thin");
        else if(bmi>=18.6 && bmi <=24.9)
            System.out.println("Healthy");
        else if(bmi>=25 && bmi <=29.9)
            System.out.println("Overweight");
        else
        System.out.println("Obese");
    }
}
