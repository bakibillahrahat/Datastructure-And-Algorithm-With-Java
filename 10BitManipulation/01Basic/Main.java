import java.util.*;

public class Bits {
    public static void main(String args[]){
        int n = 5;
        int post = 3;
        int bitMask = 1<<pos;

        if((bitMask & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    }
}