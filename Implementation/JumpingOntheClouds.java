//Problem URL: https://www.hackerrank.com/challenges/jumping-on-the-clouds/
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

public class JumpingOntheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        ArrayList<Integer> safePos=new ArrayList<>();
        for(int i=0;i<c.length;i++){
            if(c[i]==0){
                safePos.add(i);
            }
        }
        int flag=0;
        int l=safePos.get(0);
        while(l<safePos.get(safePos.size()-1)){
            if(safePos.contains(l+2)){
                l=l+2;
                flag++;
            }
            else{
                l=l+1;
                flag++;
            }
        }
        return (flag);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
