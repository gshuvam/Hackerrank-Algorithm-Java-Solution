//Problem link : https://www.hackerrank.com/challenges/simple-array-sum
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SimpleArraySum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
