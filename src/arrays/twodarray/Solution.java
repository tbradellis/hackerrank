package arrays.twodarray;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    static int hlOffset = 2; //height and length offset 3 x 3 (i.e. index 0, 1, 2)

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max = -63; // 7 * -9

        int tmp = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tmp = hourGlass(i, j, arr);
                if(tmp > max){
                    max = tmp;
                }
            }
        }

        return  max;
    }




    public static int hourGlass(int i, int j, int[][] matrix){
        int tmp=0;
        tmp += matrix[i + 1][j+1];
        for(int k = j; k <= j + hlOffset; k++){
            tmp += matrix[i][k];
            tmp += matrix[i + hlOffset][k];
        }

        return tmp;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("input00.txt"));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
