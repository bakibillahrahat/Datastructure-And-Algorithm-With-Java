import java.util.*;

public class Main{
    // function of factorial number
    public static void calculateFactorialNumber(double n){
        if(n < 0){
            System.out.println("Factorial number cannot negative number");
            return;
        }
        double result = 1;
        for(double i = n; i >= 1; i--){
            result *=  i;
        }
        System.out.println("Factorial of " + n + " is " + result);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print Factorial Number.");
        System.out.print("Enter your number: ");
        double a = sc.nextInt();
        calculateFactorialNumber(a);
    }
}