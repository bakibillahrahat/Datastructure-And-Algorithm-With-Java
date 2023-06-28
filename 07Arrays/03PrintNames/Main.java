import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Print string in arrays: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array Size: ");
        int size = sc.nextInt();
        String names[] = new String[size];
        System.out.print("Enter your names: ");
        for(int i = 0; i < names.length; i++){
            names[i] = sc.next();
        }
        for(int i = 0; i < names.length; i++){
            System.out.println("Names of " + i + " is " + names[i]);
        }
    }
}