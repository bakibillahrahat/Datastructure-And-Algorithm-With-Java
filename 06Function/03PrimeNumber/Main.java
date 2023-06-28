import java.util.*;

public class Main{
    // prime number function
    public static void primeNumber(int n){
        int flag = 0;
        if(n == 0 || n == 1){
            flag = 1;
        }
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                flag = 1;
                break;
            }
        }

        if(flag == 1){
            System.out.println(n + " is not a prime number.");
        }else{
            System.out.println(n +" is a prime number.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print Prime Number.");
        System.out.print("Enter your number: ");
        int x = sc.nextInt();
        primeNumber(x);
    }
}