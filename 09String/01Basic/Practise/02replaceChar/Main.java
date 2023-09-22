// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”
// Original = “xyz” ; result = “xyz”

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String result = "";
        String orginal = sc.nextLine();

        for(int i = 0; i < orginal.length(); i++){
            if(orginal.charAt(i) == 'e'){
                result += "i";
            }else{
                result += orginal.charAt(i);
            }
        }
        System.out.println("Replaced String: " + result);
    }
}