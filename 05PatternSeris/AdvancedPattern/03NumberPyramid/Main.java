import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Print Number pyramid!");
        int n = 5;
        for(int i = 1; i <= n; i++){
            // spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}