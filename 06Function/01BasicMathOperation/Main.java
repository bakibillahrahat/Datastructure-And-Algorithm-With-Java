import java.util.*;

public class Main{
    // Sum function
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    // Subtraction Function
    public static int calculateSub(int a, int b){
        if(a > b){
            return a - b;
        }else{
            return b - a;
        }
    }

    // Multiplication Function
    public static int calculateMultiplication(int a, int b){
        return a * b;
    }

    // Division Function
    public static int calculateDivision(int a, int b){
        return a / b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print Basic Operation using Function: ");
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        // print sum function
        System.out.print("The sum of Two number is " + calculateSum(a, b) + "\n");
        // Print subtraction function
        System.out.println("The subtraction of two number is " + calculateSub(a, b) + "\n");
        // Print Multiplication function
        System.out.println("The Multiplication of two number is " + calculateMultiplication(a, b) + "\n");
        // Print Division function
        System.out.println("The Divison of two number is " + calculateDivision(a, b) + "\n");
    }
}