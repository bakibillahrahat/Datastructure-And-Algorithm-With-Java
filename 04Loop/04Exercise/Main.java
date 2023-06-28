import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner inp1 = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int input1 = inp1.nextInt();
        // *** Print table input from user ***
        // for(int i = 1; i <= 10; i++){
        //     System.out.println(input1 + " x " + i + " = " + input1 * i);
        // }

        // *** print Even Number ***
        System.out.println("Even Number: ");
        for(int i = 1; i <= input1; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}