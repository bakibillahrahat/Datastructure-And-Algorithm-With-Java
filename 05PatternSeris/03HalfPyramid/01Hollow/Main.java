import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Print Hollow pyramid");
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(i == 1 || i == n || j == 1 || j == i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}