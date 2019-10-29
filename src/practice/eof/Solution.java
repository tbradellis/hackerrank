package practice.eof;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Reader reader = new InputStreamReader(System.in);
        LineNumberReader lineNumberReader = new LineNumberReader(reader);
        String line;
        while((line = lineNumberReader.getLineNumber() + " " +lineNumberReader.readLine()) != null && line.length()!= 0){
            System.out.println(line);
        }
    }
}

