public class Conversion {
    public static void main(String[] args) {
        int i = 5;
        double d = 2.5;
        float f = 1.5f;

        double result1 = i + d; 
        double result2 = i * f; 
        float result3 = f / i; 

        
        System.out.println("Result of int + double: " + result1);
        System.out.println("Result of int * float: " + result2);
        System.out.println("Result of float / int: " + result3);
    }
}