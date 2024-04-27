// Write a program to count the number of 1's in a binary representation of a number.


import java.util.*;

public class Main {
    public static void countOnes(int n){
        int count = 0;
        while(n > 0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        // Count the number of 1's in a binary representation of a number
        countOnes(5);
    }
    
}
