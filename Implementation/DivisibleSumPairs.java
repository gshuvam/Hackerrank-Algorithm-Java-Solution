//Problem link : https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class DivisibleSumPairs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            
            for(int j=i+1;j<n;j++){
                int sum=0;
                sum=arr[j]+arr[i];
                if(sum%k==0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
