package warmup.repeatedstrings;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        char[] array = s.toCharArray();
        long completeS = n / array.length;
        long partialS = n - (array.length * completeS);
        long runningTotal = 0;
        for(int k =0; k <  array.length; k++){
            if(array[k] == 'a'){
                ++runningTotal;
            }
        }
        runningTotal = runningTotal * completeS;

        if(partialS>0){
            for(int j = 0; j < partialS; j++){
                if(array[j]=='a'){
                    ++runningTotal;
                }
            }
        }
        return runningTotal;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String a = "a";//abbaabbaab

        System.out.println(repeatedString(a, 1000000000));

    }

}
