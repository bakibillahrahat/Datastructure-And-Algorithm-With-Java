// Print the spiral order matrix as output for a given matrix of numbers

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print Sprial order matrix");
        System.out.print("Enter the size of row: ");
        int n = sc.nextInt();
        System.out.print("Enter the size of colums: ");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        // take input for matrix
        System.out.println("Enter your matrix elements: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j< m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // print matrix in spiral order
        int row_start = 0;
        int row_end = n - 1;
        int column_start = 0;
        int column_end = m - 1;

        // System.out.println("Output: ");
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         if(i == 0 || j == 0 || i == row_end || j == column_end){
        //             System.out.print(matrix[i][j]+" ");
        //         }
        //     }
        // }

        while(row_start <= row_end && column_start <= column_end){
            // 1
            for(int col=column_start; col <=column_end; col++){
                System.out.print(matrix[row_start][col]+" ");
            }
            row_start++;
            // 2
             for(int row=row_start; row <= row_end; row++){
                System.out.print(matrix[row][column_end]+" ");
             }
             column_end--;
             // 3
             for(int col=column_end; col >= column_start; col--){
                System.out.print(matrix[row_end][col] + " ");
             }
             row_end--;
             // 4
             for(int row=row_end; row >= row_start; row--){
                System.out.print(matrix[row][column_start]+" ");
             }
             column_start++;
             System.out.println();
        }
    }
}