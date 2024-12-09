import java.util.*;

public class Sorting {
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // partition the array
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    // Quick Sort
public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    // merge two sorted arrays
    public static void conquer(int arr[], int si, int mid, int ei){
        int merged[] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }
        for(int i =0, j = si; i < merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }

    // merge sort using recursion    
    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
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
        // call merge sort
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
        // call quick sort
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
