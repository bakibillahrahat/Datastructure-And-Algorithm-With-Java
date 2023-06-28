import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Print a solid rhombus");
        int n = 5;
        int m = 5;
        for(int i = 1; i <= n; i++){
            // print space
            for(int j = 1; j <= m-i; j++){
                System.out.print(" ");
            }
            // print star
            for(int j = 1; j <= m; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}