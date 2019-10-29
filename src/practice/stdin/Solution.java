package practice.stdin;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while(scan.hasNextInt()) {
            ++count;
            System.out.println(scan.nextInt());
            if(count >=3){
                break;
            }
        }

    }
}

