package sorting.insertion.partone;

import java.util.Scanner;

public class Solution {

    // Complete the insertionSort1 function below.
    @SuppressWarnings("Duplicates")
    static void insertionSort1(int n, int[] arr) {
        int hold = arr[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            if(i==0){
                arr[i]=hold;
                printArrayNL(arr);
                break;
            }
            if (arr[i - 1] < hold ) {
                arr[i] = hold;
                printArrayNL(arr);
                break;
            } else {
                arr[i] = arr[i - 1];
                printArrayNL(arr);
            }
        }

    }

    static void printArrayNL(int[] a) {
        StringBuilder c = new StringBuilder("");
        for (int b : a) {
            c.append(b + " ");
        }
        System.out.println(c);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 1 };
        int n = 10;
        insertionSort1(n, array);
    }
}