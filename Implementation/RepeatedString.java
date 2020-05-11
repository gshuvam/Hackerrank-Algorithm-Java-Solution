//Problem URl : https://www.hackerrank.com/challenges/repeated-string

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

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        // long no=0;
        // long leftOutA=0;
        // if(n>1000000){
        //     long value=0;
        //     if(s.length()==1 && s.charAt(0)=='a'){
        //         value=n;
        //     }
        //     else if(s.length()==1 && s.charAt(0)!='a'){
        //         value=noOfA;
        //     }
        //     else if(s.length()>1){
        //         int no=0;
        //         int leftOutA=0;
        //         for(int i=0;i<s.length();i++){
        //             if(s.charAt(i)=='a'){
        //                 no++;
        //             }
        //             long remaining=n%(s.length());
        //             for(int k=0;k<remaining;k++){
        //                 if(s.charAt(k)=='a'){
        //                     leftOutA++;
        //                 }
        //             }
                    

        //         }
        //        value= ((no*(n/s.length()))+leftOutA);
        //     }
        //     return value;
        // }
        // else{
        //     while(s.length()<n){
        //         s=s+s;
        //     }
        //     int no=(int)n;
        //     for(int i=0;i<n;i++){
        //         if(s.charAt(i)=='a'){
        //             noOfA++;
        //         }
        //     }
        //     return noOfA;
        // }
        int no=0;
        int leftOutA=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                no++;
            }
        }
        long remaining=n%(s.length());
        for(int k=0;k<remaining;k++){
            if(s.charAt(k)=='a'){
                leftOutA++;
            }
        }

        return ((no*(n/s.length()))+leftOutA);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
