import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Print Inverted Rotated Half Pyramid");
        int n = 4;
        for(int i = n; i >= 1; i--){
            //inner loop -> print space
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    } 
}
