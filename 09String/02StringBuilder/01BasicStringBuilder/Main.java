// Basic string builder 

import java.util.*;

public class Main{
    public static void main(String[] args){
        // declare string builder
        StringBuilder sb = new StringBuilder("MD. Bakibillah Rahat");
        System.out.println(sb);

        // char at index 0 using charAt() method
        System.out.println("Char at index 0 : " + sb.charAt(0));

        // set char at index 0 using setCharAt(index, char) method
        sb.setCharAt(0, 'P');
        System.out.println("Set char at index 0" + sb);

        // insert char at index 0 using insert(index, char) method;
        sb.insert(0, 'S');
        System.out.println("Inserted String : " + sb);

        // delete char at any index using delete(startingIndex, endingIndex) method;
        sb.delete(5, 6);
        System.out.println("After delete : " + sb);

        // append string using append(char) method
        StringBuilder sc = new StringBuilder("h");
        System.out.println("Before append: " + sc);
        sc.append('e');
        sc.append('l');
        sc.append('l');
        sc.append('o');
        System.out.println("After append: " + sc + " Length " + sc.length());

        // reverse string
        // pattern 01
        for(int i = 0; i < sc.length()/2; i++){
            int front = i;
            int back = sc.length()-1-i;

            char frontChar = sc.charAt(front);
            char backChar = sc.charAt(back);

            sc.setCharAt(front, backChar);
            sc.setCharAt(back, frontChar);
        }
        System.out.println("Reverse String: " + sc);
        // pattern02
        String reverseStr = "";
        for (int j=sc.length()-1; j >= 0; j--) {
            reverseStr += sc.charAt(j);
        }
        System.out.println("Reverse String: " + reverseStr);
    }
}