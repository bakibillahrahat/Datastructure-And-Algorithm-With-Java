import java.util.*;

public class DoWhile{
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner inp = new Scanner(System.in);
        int input1 = inp.nextInt();
        int i = 101;
        int result = 0;
        do {
            System.out.println(i);
            result += i;
            i++;
        }while(i <= input1);
        System.out.print("Result: " + result);
    }
}