import java.util.*;

public class Main{
    public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
        System.out.println("Find vowel");
        System.out.print("Enter your character: ");
        char a = sc.next().charAt(0);

        switch(a){
            case 'A':
                System.out.println("A is Vowel");
                break;
            case 'E':
                System.out.println("E is Vowel");
                break;
            case 'I':
                System.out.println("I is Vowel");
                break;
            case 'O':
                System.out.println("O is Vowel");
                break;
            case 'U':
                System.out.println("U is Vowel");
                break;
            case 'a':
                System.out.println("a is Vowel");
                break;
            case 'e':
                System.out.println("e is Vowel");
                break;
            case 'i':
                System.out.println("i is Vowel");
                break;
            case 'o':
                System.out.println("o is Vowel");
                break;
            case 'u':
                System.out.println("u is Vowel");
                break;
            default:
                System.out.println(a + " is Consonent");
        }
    }
}