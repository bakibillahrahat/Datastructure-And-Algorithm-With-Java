import java.util.*;

public class Main{
    public static int average(int x, int y, int z){
        int average = (x + y + z) / 3;
        return average;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Average of three number: ");
        System.out.println("Enter your number:  ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println("Average of three number ( "+ x + " " + y + " " + z + " ) " + " is " + average(x, y, z));
    }
}