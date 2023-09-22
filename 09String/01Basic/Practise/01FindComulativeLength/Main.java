// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your size: ");
        int size = sc.nextInt();
        
        String array[] = new String[size];

        int toLength = 0;
        System.out.print("Enter the string element: ");
        for(int i = 0; i < size; i++){
            array[i] = sc.next();
            toLength += array[i].length();
        }

        System.out.println(toLength);
    }
}