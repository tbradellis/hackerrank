package arrays.leftrotation;
import java.util.Scanner;

public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        while(d > 0){
           a = rotateLeft(a);
           --d;
        }
        return a;
    }
    private static int[] rotateLeft(int[] a){

        int zeroth = 0;
        for(int i = 0; i <= a.length-1; i++){
            if(i==0){
                zeroth = a[i];
            }
            if(i==a.length-1){
                a[i] = zeroth;
                break;
            }
            a[i] = a[i+1];
        }

        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        for(int b : rotLeft(array, 4)){
            System.out.print(b + " ");

        }

    }

}

