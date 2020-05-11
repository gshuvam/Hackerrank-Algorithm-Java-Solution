//Problem Link : https://www.hackerrank.com/challenges/picking-numbers/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class PickingNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            int count1=1;
            int count2=1;
            int count=0;
            for(int j=i+1;j<n;j++){
                if((arr[i]-arr[j])==1){
                    count1++; 
                }
                else if((arr[i]-arr[j])==-1){
                    count2++; 
                }
                else if ((arr[i]-arr[j])==0){
                    count1++;
                    count2++;
                }
            }
            count=Math.max(count1,count2);
            if(count>max)
            max=count;
        }
        System.out.println(max);
    }
}
