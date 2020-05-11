/*Problem link : https://www.hackerrank.com/challenges/mini-max-sum/submissions/code/153091954*/
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/

import java.util.Scanner;
import java.util.Arrays;

public class MiniMax{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long[] arr=new long[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextLong();
        }
        long n=5;
        Arrays.sort(arr);
        long minsum=0;
        long maxsum=0;
        for(int i=0;i<n-1;i++){
            minsum+=arr[i];
        }
        for(int i=1;i<n;i++){
            maxsum+=arr[i];
        }
        System.out.println(minsum+" "+maxsum);
    }
}
