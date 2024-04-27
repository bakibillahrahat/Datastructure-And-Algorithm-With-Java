// write a program to find if a number is a power of 2 or not.

import java.util.*;

public class Main {
    // Create Function to find if a number is a power of 2 or not
    public static void isPowerOfTwo(int n){
        if((n & (n-1)) == 0){
            System.out.println("Number is a power of 2");
        }else{
            System.out.println("Number is not a power of 2");
        }
    }
    public static void main(String[] args){
        // Find if a number is a power of 2 or not
        isPowerOfTwo(16);
    }
}
