package algorithms.search.radiotx;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    // Complete the hackerlandRadioTransmitters function below.
    // 1 2 3 5 8
    static int hackerlandRadioTransmitters(int[] x, int k) {
        Arrays.sort(x);
        int txcount = 0;
        int i = 0;
        int n = x.length;
        String txvals = "";

        while(i < n){
            ++txcount;
            int boundary = x[i] + k;
            while(i < n && x[i] <= boundary){
                ++i;
            }
            --i;
            System.out.println("i = " + i +" val= " + x[i]);

            boundary = x[i] + k;
            while(i < n && x[i] <= boundary){
                i++;
            }

        }

        return txcount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int[] x = {1,5,6,7,9};
        int k = 1; //tx distance


        int result = hackerlandRadioTransmitters(x, k);
        System.out.println("result= " + result);
    }
}
