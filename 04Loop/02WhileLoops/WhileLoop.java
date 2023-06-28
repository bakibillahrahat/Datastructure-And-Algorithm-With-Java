import java.util.*;

public class WhileLoop {
    public static void main(String[] args) {
        // enter your number
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your number: ");

        int result = 0;
        int count = 1;
        System.out.println("Output: ");
        while(count <= 100) {
            System.out.println(count);
            result += count;
            count ++;
        }
        System.out.print("Result: ");
        System.out.println(result);
    }
}