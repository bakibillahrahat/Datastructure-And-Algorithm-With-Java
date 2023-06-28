import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Floyd's Triangle");
        int n = 5;
        int number = 1;
        // Outer loop
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(number+ " ");
                number++;
            }
            System.out.println("");
        }
    }
}