// For given matrix N x M, print its transpose

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print transpose Matrix.");
        System.out.print("Enter the size or rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the size or cols: ");
        int cols = sc.nextInt();

        // declare 2d Array
        int matrix[][] = new int[rows][cols];

        // take input for matrix
        System.out.println("Enter the matrix values: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // output: print transpose matrix
        System.out.println("Transpose Matrix: \n");
        for(int j = 0; j < cols; j++){
            for(int i = 0; i < rows; i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}