import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print 2D arrays");
        System.out.print("Numbers of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Numbers of Coloumns: ");
        int cols = sc.nextInt();
        int numbers[][] = new int[rows][cols];

        System.out.println("Enter your element: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Output: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println("");
        }

    }
}