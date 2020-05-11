//Problem link : https://www.hackerrank.com/challenges/sock-merchant/problem
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

public class StockMerchant {

    // Complete the sockMerchant function below.
    
    static int sockMerchant(int n, int[] ar) {
        ArrayList<Integer> arr=new ArrayList<>();
        int usablePairs=0;
        for(int i=0;i<n;i++){
            if(!arr.contains(ar[i])){
                arr.add(ar[i]);
            }
            else if(arr.contains(ar[i])){
                arr.remove(arr.indexOf(ar[i]));
                usablePairs++;
            }
        }
        return usablePairs;

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
