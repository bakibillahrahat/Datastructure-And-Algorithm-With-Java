// Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Numbers of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Numbers of Columns: ");
        int cols = sc.nextInt();
        System.out.println("Enter your numbers: ");

        // declare arr
        int numbers[][] = new int[rows][cols];

        // take input
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        // take input for search number from array
        System.out.print("Enter your number for search:");
        int num = sc.nextInt();

        // print output
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(numbers[i][j] == num){
                    System.out.println("The number of " + num + "is " + i + ", " + j);
                }else if(numbers[i][j] != num){
                    System.out.println("Invalid input");
                }
            }
        }

    }
    
}
