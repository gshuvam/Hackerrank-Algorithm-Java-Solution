//Problem Link : https://www.hackerrank.com/challenges/countingsort1
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class CountingSOrtOne {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arr2=new int[100];
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            arr[i]=t;
            arr2[t]+=1;
        }
        for(int i=0;i<100;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
