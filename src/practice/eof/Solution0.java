package practice.eof;

import java.util.Scanner;

public class Solution0 {

    public static void main(String[] args) {

        Scanner line = new Scanner(System.in);
        int counter = 0;
        while(line.hasNextLine()){
            ++counter;
            System.out.println(counter + " " + line.nextLine());
        }
    }
}
