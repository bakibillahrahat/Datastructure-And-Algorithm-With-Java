import java.util.*;

public class Main{

    public static void longestNumber(int x, int y ){
        if(x > y){
            System.out.println(x + " is the largest number.");
        }else{
            System.out.println(y + " is the largest number.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Find longest number between two numbers.");
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();

        longestNumber(a, b);

    }
}