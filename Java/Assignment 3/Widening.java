public class Widening {
    public static void main(String[] args) {
        int i = 10;
        double d = i; // Widening conversion from int to double
        
        System.out.println("Original int value: " + i);
        System.out.println("Widened double value: " + d);
    }
}