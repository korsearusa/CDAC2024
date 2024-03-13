import java.util.*;
class vowel{
    public static void main(String args[]){
        System.out.println("Enter a character:");
        Scanner sc= new Scanner(System.in);
        char c = sc.next().charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'  )
        System.out.println("A vowel");
        else
        System.out.println("A Consonant");
    }
}