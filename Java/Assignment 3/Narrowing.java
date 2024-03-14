public class Narrowing {
    public static void main(String[] args) {
        
        double d = 10.5; // Widening conversion from int to double
        int i = (int)d;
       
        System.out.println("Original double value: " + d);
        System.out.println("Narrowed int value: " + i);
    }
}