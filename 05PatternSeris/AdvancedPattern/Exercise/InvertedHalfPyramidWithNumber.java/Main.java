import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Print Inverted Half Pyramid with number.");
        int n = 5;
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}