import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int size = sc.nextInt();
        System.out.print("Enter your elements of array: ");
        int numbers[] = new int[size];
        for(int i = 0; i < size; i++){
            numbers[i] =  sc.nextInt();
        }

        System.out.print("Enter your element that you want to search: ");
        int s = sc.nextInt();

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == s){
                System.out.println("Index number of " + numbers[i] + " is " + i);
            }else{
                System.out.println("Element Invalid!");
            }
        }
    }
}