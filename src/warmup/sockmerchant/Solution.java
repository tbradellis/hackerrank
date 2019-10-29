package warmup.sockmerchant;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    // Complete the sockMerchant function below.
    //can you change this solution to count while adding instead of
    //after your are finished.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> allSocksByColor = new HashMap<>();
        int pairs = 0;
        for(int i : ar ){
            if(allSocksByColor.get(i) == null){
                allSocksByColor.put(i, 1);
            }else{
                allSocksByColor.put(i, allSocksByColor.get(i) + 1);
            }

        }

        for(int values : allSocksByColor.values()){
            pairs += values/2;
        }

        return pairs;

    }
    static int sockMerchantNoDoubleFor(int n, int[] ar){
        Map<Integer, Integer> allSocksByColor = new HashMap<>();
        int pairs = 0;
        for(int i : ar ){
            if(allSocksByColor.get(i) == null){
                allSocksByColor.put(i, 1);

            }else{
                allSocksByColor.put(i, allSocksByColor.get(i) + 1);
            }
            if(allSocksByColor.get(i) % 2 == 0){
                ++pairs;
            }
        }
        return pairs;
    }

    static int sockMerchantSet(int n, int[] ar) {
        Set<Integer> allSocksByColor = new HashSet();
        int pairs = 0;
        for(int i = 0; i < n; i++){
            if(!allSocksByColor.contains(ar[i])){
                allSocksByColor.add(ar[i]);
            }else{
                ++pairs;
                allSocksByColor.remove(ar[i]);
            }
        }
        return pairs;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        for(int i = 0; i < 1_000_000; i++){

        }
        int[] array = {1, 2, 3,3,3,4,4,4,4, 1, 2, 5,5,5,5,6,6,7,7,8,9,9};
        for(int i = 0; i < 1_000_000; i++){
            sockMerchant(array.length, array);
            sockMerchantSet(array.length,array);
            sockMerchantNoDoubleFor(array.length,array);
        }

        long endTime;
        long startTime = System.nanoTime();
        int pairsMap = sockMerchant(array.length, array);
        endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("duration in ns map= " + duration);
        System.out.println(pairsMap);

        startTime = System.nanoTime();
        int pairsSet = sockMerchantSet(array.length, array);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("duration in ns set= " + duration);
        System.out.println(pairsSet);

        startTime = System.nanoTime();
        int pairsMapFixed = sockMerchantNoDoubleFor(array.length, array);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("duration in ns noDoubleForMap = " + duration);
        System.out.println(pairsMapFixed);
    }
}
