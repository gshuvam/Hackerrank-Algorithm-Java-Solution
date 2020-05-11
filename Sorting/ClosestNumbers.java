//Problem Link : https://www.hackerrank.com/challenges/closest-numbers/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;
import java.util.Arrays;

public class ClosestNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=Integer.MAX_VALUE;
        int index=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n-1;i++){
            int diff=Math.abs(arr[i+1]-arr[i]);
            if(diff<min){
                min=diff;
            }
        }
        for(int i=0;i<n-1;i++){
            int diff=Math.abs(arr[i+1]-arr[i]);
            if(diff==min){
                sb.append(arr[i]).append(" ").append(arr[i+1]).append(" ");
            }
        }
        System.out.println(sb.toString());

    
    }
}
