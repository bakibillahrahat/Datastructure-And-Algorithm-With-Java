// Java String are immutable

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // take string as an input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Your name is " + name);

        // concatenation 
        String firstName = "MD. Bakibillah";
        String lastName = "Rahat";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // get string length
        System.out.println("String Length: " + fullName.length());

        // print string character using charAt
        for(int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        // compare two string using compareTo() function
        // s1 > s2 : +ve value
        // s1 == s2 :
        // s1 < s2 : -ve value

        String name1 = "Rahat";
        String name2 = "Rahat";

        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("String are not equal");
        }

        // some times it not works like

        if(new String("Rahat") == new String("Rahat")) {
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        // sub-string using substring(beginIndex, endingIndex)
        String sentence = "I am MD. Bakibillah Rahat";
        String nameStr = sentence.substring(5);
        String subStr1 = sentence.substring(3, 21);
        System.out.println(nameStr);
        System.out.println(subStr1);

        // int to string using parseInt(str) method
        String num = "4527";
        int number = Integer.parseInt(num);
        System.out.println("Number: " + number);

        // int to string using ToString() method
        int nmb = 2043023;
        String str = Integer.toString(nmb);
        System.out.println("String: " + str + " Length: " + str.length());

    }
}