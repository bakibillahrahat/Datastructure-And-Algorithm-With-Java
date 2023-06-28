import java.util.*;

public class Main{
    public static void printTable(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " X " + i + " = " + n*i);
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Prnt the table of a given number.");
        System.out.print("Enter your number: ");
        int x = sc.nextInt();
        printTable(x);
    }
}