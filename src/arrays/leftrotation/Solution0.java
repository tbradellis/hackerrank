package arrays.leftrotation;

import java.util.Scanner;

public class Solution0 {


    // Complete the rotLeft function below.

    static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = a[(i + d) % n ];
        }
        return b;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        for(int b : rotLeft(array, 4)){
            System.out.print(b + " ");

        }

    }

}

