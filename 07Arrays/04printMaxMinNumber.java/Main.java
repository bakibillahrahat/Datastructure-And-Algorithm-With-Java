import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter your array elements: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Largest number is: " + max);
        System.out.println("Smallest number is: " + min);
    }
}