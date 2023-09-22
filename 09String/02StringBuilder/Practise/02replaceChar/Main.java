// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        StringBuilder original = new StringBuilder(sc.nextLine());

        for(int i = 0; i < original.length(); i++){
            if(original.charAt(i) == 'e'){
                original.setCharAt(i, 'i');
            }
        }
        System.out.println("Replaced String: " + original);
    }
}