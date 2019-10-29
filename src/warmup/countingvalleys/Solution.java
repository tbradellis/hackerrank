package warmup.countingvalleys;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        int valleyCount = 0;
        int seaLevel = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'U'){
                ++seaLevel;
                if(seaLevel == 0){
                    ++valleyCount;
                }
            }
            if(s.charAt(i) == 'D'){
                --seaLevel;
            }
        }
        return valleyCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = "DDUUUUDD";
        int valleys = countingValleys(8, s);
        System.out.println("valleys = " + valleys);
    }
}
