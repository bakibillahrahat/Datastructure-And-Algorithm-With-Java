import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Print hollow butter fly pattern");
        int n = 5;
        // uper section
        for(int i = 1; i <= n; i++){
            // print 1st part star
            for(int j = 1; j <= i; j++){
                if(i == 1 || j == 1 || j == i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            // print spaces
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            // print 2nd part star
            for(int j = 1; j <= i; j++){
                if(i == 1 || j == 1 || j == i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        // lower section
        for(int i = n; i >= 1; i--){
            // print 1st part star
            for(int j = 1; j <= i; j++){
                if(i == 1 || j == 1 || j == i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            // print spaces
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            // print 2nd part star
            for(int j = 1; j <= i; j++){
                if(i == 1 || j == 1 || j == i ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}