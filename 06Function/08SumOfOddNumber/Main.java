import java.util.*;

public class Main{
    //sum of odd number
    public static int sumOffOddNumber(int n){
        int result = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                result += i;
            }
        }
        return result;
    }
    // Main Function
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the sum of all odd numbers from 1 to n.");
        System.out.print("Enter your range number: ");
        int x = sc.nextInt();
        System.out.println("The sum of total odd number { 1 to "+ x + " } is: " + sumOffOddNumber(x));
    }
}