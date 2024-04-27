// Write a program to toggle a bit at a given position in a number.

import java.util.*;

public class Main {
    public static void toggleBit(int n, int pos){
        int bitMask = 1<<pos;
        int newNumber = bitMask ^ n;
        System.out.println(newNumber);
    }
    public static void main(String[] args){
        // Toggle the 3rd bit (position = 2) of a number n.(n = 0101)
        toggleBit(5, 2);
    }
}
