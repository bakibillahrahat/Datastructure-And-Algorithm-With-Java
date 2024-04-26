import java.util.*;

public class Main {
    // Create Function to Get Bit of a number at a given position
    public static void getBit(int n, int pos){
        int bitMask = 1<<pos;
        if((bitMask & n) == 0){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was one");
        }
    }
    // Create Function to Set Bit of a number at a given position
    public static void setBit(int n, int pos){
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
    // Clear the 3rd bit (position = 2) of a number n.(n = 0101)
    public static void clearBit(int n, int pos){
        int bitMask = ~(1<<pos);
        int newNumber = bitMask & n;
        System.out.println(newNumber);
    }
    // Update the 3rd bit (position = 2) of a number n to 1.(n = 0101)
    public static void updateBit(int n, int pos, int value){
        int newNumber;
        if(value == 0){
            clearBit(n, pos);
        }else{
            setBit(n, pos);
        }
    }
    public static void main(String args[]){
        // Get Bit of a number at a given position
        getBit(3, 0);
        // Set Bit of a number at a given position
        setBit(5, 1);
        // Clear the 3rd bit (position = 2) of a number n.(n = 0101)
        clearBit(5, 2);
        // Update the 3rd bit (position = 2) of a number n to 1.(n = 0101)
        updateBit(5, 1, 1);
    }
}