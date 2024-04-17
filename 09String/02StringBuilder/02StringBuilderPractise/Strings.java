import java.util.*;

public class Strings {
    public static void main(String[] args){
        // StringBuilder sb = new StringBuilder("MD. Bakibillah Rahat");
        // System.out.println(sb.charAt(0));

        // // set char at index
        // sb.setCharAt(0, 'P');
        // sb.insert(0, "S");
        // sb.insert(11, 'l');
        // sb.delete(0, 5);
        // System.out.println(sb.length());j

        StringBuilder sb = new StringBuilder("hello");

        for(int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
