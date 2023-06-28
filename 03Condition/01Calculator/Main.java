import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Basic calculator");
        System.out.print("Please enter your sign: ");
        char sign = sc.next().charAt(0);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if(sign == '+'){
            System.out.println("Sumition of a + b is : " + (a + b));
        }else if(sign == '-'){
            System.out.println("Subtraction of a - b is: " + (a - b));
        }else if(sign == '*'){
            System.out.println("Multiplication of a * b is: " + (a * b));
        }else if(sign == '/'){
            System.out.println("Division of a / b is: " + (a / b));
        }else{
            System.out.println("Invalid Instruction!");
        }

    }
}
