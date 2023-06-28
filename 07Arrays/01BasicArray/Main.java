import java.util.*;

public class Main{
    public static void main(String[] args){
        // int[] marks = new int[3];
        // int marks[] = new int[3];
        // int marks[] = {97, 98, 99};
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 99;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        // input
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        // Output
        for(int i = 0; i < size; i++){
            System.out.println(numbers[i]);
        }
    }
}