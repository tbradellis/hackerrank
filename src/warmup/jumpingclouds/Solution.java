package warmup.jumpingclouds;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int hops = 0;
        hops += countHops(0, c);
        return hops;

    }

    public static int countHops(int start, int[] array){
        int hops=0;
        //last hop, it never matters what the second to last
        //element will be, the last element is an invariant 0.
        if(start + 2 >= array.length-1){
            return ++hops;
        }
        if(array[start+2] ==  0){
            ++hops;
            start = start + 2;
            hops += countHops(start,array );
        }else if(array[start+1]==0) {
                ++hops;
                start = start +1;
                hops += countHops(start,array);
            }
        return hops;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] a = {0,1,0,1,0};//2
        int[] b = {0,1,0,1,0,0,0,0,0,0};//5
        int[] c = {0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0};//10


        System.out.println(jumpingOnClouds(a));
        System.out.println(jumpingOnClouds(b));

        System.out.println(jumpingOnClouds(c));


    }
}
