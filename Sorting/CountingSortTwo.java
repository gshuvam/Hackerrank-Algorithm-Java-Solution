//Problem Link : https://www.hackerrank.com/challenges/countingsort2
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class CountingSortTwo {

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
        for(int i=1;i<100;i++){
            arr2[i]+=arr2[i-1];
        }
        int[] sortedArr=new int[n];
        for(int i=0;i<n;i++){
            sortedArr[arr2[arr[i]]-1]=arr[i];
            arr2[arr[i]]--;
        }
        for(int i=0;i<n;i++){
            System.out.print(sortedArr[i]+" ");
        }
    }
}
