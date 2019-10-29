package sorting.bubblesort;
import java.util.Scanner;

public class Solution {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int n = a.length;
        int swaps = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    ++swaps;
                }
            }

        }
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First  Element: "+ a[0] );
        System.out.println("Last  Element: "+ a[a.length-1] );

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] a = {33, 1  ,3, 4, 2, 55};

        countSwaps(a);
    }



}
