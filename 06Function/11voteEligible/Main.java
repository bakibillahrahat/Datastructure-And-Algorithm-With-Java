import java.util.*;

public class Main{
    // crate function for check eligible
    public static void eligible(int x){
        if(x > 18){
            System.out.println("This person eligible for vote.");
            return;
        }else if(x > 0 && x < 18){
            System.out.println("This person is not eligible for vote.");
            return;
        }else{
            System.out.println("Invalid age!");
            return;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print person is eligible to vote or not.");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // function call
        eligible(age);
    }
}