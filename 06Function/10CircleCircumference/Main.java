import java.util.*;

public class Main {
    public static double circumference(double x){
        double pi = 3.1416;
        double circumference = 2 * pi * x;
        return circumference;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print Circle circumference of a circle.");
        System.out.print("Enter your radius: ");
        int r = sc.nextInt();
        System.out.println("Circle circumference: " + circumference(r));
    }
}
