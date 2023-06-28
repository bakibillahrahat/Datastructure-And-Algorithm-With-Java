import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Check is an array sorted in ascending order or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter your elements of array: ");
        int numbers[] = new int[size];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        boolean isAssending = true;

        for(int i = 0; i < numbers.length-1; i++){
            if(numbers[i] > numbers[i+1]){
                isAssending = false;
            }
        }

        if(isAssending){
            System.out.println("The are is sorted in ascending order.");
        }else{
            System.out.println("The are is not sorted in ascending order.");
        }
    }
}
