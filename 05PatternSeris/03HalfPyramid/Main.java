import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Print Half Pyramid");
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i+1; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}