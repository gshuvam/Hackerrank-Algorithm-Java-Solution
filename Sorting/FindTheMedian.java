//Problem Link : https://www.hackerrank.com/challenges/find-the-median
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Arrays;
import java.util.Scanner;

public class FindTheMedian {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n/2]);
    }
}
