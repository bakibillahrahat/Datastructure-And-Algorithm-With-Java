import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Print Butterfly Pattern");
        int n = 5;
        // Upper half
        for(int i = 1; i <= n; i++){
            // 1st part
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // 2nd part
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            // 3rd part
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        // lower half
        for(int i = n; i >= 1; i--){
            // 1st part
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // 2nd part
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            // 3rd part
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}