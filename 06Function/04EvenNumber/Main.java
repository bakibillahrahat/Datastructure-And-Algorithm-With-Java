import java.util.*;

public class Main{
    public static void identifyEvenOrOdd(int n){
        if(n % 2 == 0){
            System.out.println(n + " is a even number.");
            return;
        }else{
            System.out.println(n + " is a odd number.");
            return;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Print the number even or odd: ");
        int x = sc.nextInt();
        identifyEvenOrOdd(x);

    }
}