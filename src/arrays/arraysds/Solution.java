package arrays.arraysds;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int[] b = new int[a.length];
        int j = 0;
        for(int i = a.length-1; i >=0; i--, j++){
            b[j] = a[i];
        }
        return b;
    }
    static int[] reverseArrayTwo(int[] b){
        int n = b.length-1;
        int boundary = n/2;
        for(int i = 0; i <= boundary; i++){
            int tmp = b[i];
            b[i] = b[n];
            b[n] = tmp;
            --n;
        }
        return b;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] array = {1,2,3};
        System.out.print("array: ");
        for(int a : array){
            System.out.print(a + " ");
        }
        System.out.print("\nreverse array: ");

        for(int b : reverseArray(array)){
            System.out.print(b + " ");
        }

        System.out.println("\nReverseTWO Test");


        int[] array2 = {1,2,3,4};
        System.out.print("array2: ");
        for(int a : array2){
            System.out.print(a + " ");
        }
        System.out.print("\nreverse array2: ");

        for(int b : reverseArrayTwo(array2)){
            System.out.print(b + " ");
        }
    }
}
