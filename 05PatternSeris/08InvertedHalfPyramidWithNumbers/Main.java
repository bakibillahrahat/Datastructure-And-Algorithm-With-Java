import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Inverted Half Pyramid with Numbers.");
        int n = 5;
        // for(int i = n; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println("");
        // }

        // ** Another Method **
            // outer loop
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i + 1; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}