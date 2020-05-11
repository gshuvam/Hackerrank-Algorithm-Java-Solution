//Problem link : https://www.hackerrank.com/challenges/counting-valleys/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingVally {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int height=0;
        int noOfVally=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='U'){
                height++;
            }
            else if(s.charAt(i)=='D'){
               
                if(height==0){
                    noOfVally++;
                }
                 height--;
            }
        }
        return noOfVally;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
