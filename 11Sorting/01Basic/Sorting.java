import java.util.*;

public class Sorting {
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // selection sort
    public static void selectionSort(int arr[]){
        int arrLen = arr.length;
        for(int i = 0; i < arrLen-1; i++){
            int minIndex = i;
            for(int j = i+1; j < arrLen; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
        }
        printArray(arr);
    }
    // insertion sort
    public static void insertionSort(int arr[]){    
        int arrLen = arr.length;
        for(int i = 1; i < arrLen; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
        }
        printArray(arr);
    }


    // bubble sort
    public static void bubbleSort(int arr[]){
        int arrLen = arr.length;
        for(int i = 0; i < arrLen-1; i++){
            for(int j = 0; j < arrLen-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void main(String[] args){
        int arr[] = {7, 8, 3, 1, 2};
        // call bubble sort
        bubbleSort(arr);
        // call selection sort
        selectionSort(arr);
        // call insertion sort
        insertionSort(arr);

    }
}
