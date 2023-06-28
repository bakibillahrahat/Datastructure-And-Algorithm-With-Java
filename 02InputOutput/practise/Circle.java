import java.util.*;

public class Circle{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int r = myObj.nextInt();
        final float pi = 3.1416F;
        float area = (pi * r * r);
        System.out.print("Area: " + area);
    }
}