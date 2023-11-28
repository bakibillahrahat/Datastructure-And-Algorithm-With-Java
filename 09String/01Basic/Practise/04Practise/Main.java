import java.util.*;

public class Main {
    public static void main(String[] args) {
        // create a string
        String greet = "Hello! World";
        System.out.println("String: " + greet);

        // get the length of greet
        int length = greet.length();
        System.out.println(("Length: " + length));

        // create first stirng
        String first = "Java ";
        System.out.println("First String: " + first);

        // create second
        String second = "Programming";
        System.out.println("Second String: " + second);

        // join two strings
        String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);

        // create 3 strings
        String frst = "java programming";
        String scnd = "java programming";
        String third = "python programming";

        // compare first and second strings
        boolean result1 = frst.equals(scnd);
        System.out.println("Strings first and second are equal: " + result1);

        // compare first and third strings
        boolean result2 = frst.equals(third);
        System.out.println("Strings first and third are equal: " + result2);

        // use the escape character
        String example = "This is the \"String\" class.";
        System.out.println(example);

    }
}