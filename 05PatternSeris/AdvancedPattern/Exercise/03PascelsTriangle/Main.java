import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Print Pascles Triangle.");

        int n = 10;
        for(int i = 1; i <= n; i++){
            // spaces 
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            int c = 1;
            for(int j = 1; j <= i; j++){
                System.out.print(c+" ");
                c = c*(i-j)/j;
            }
            System.out.println("");
        }
    }
}