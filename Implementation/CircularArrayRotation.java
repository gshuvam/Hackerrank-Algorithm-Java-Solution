//Problem URL : https://www.hackerrank.com/challenges/circular-array-rotation/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class CircularArrayRotation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int q=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(k<n){
            while(k!=0){
            int temp=arr[n-1];
            for(int i=n-2;i>=0;i--){
                arr[i+1]=arr[i];
            }
            arr[0]=temp;
            k--;
            }
        }
        else if(k>n){
            k=(k-n);
            while(k!=0){
            int temp=arr[n-1];
            for(int i=n-2;i>=0;i--){
                arr[i+1]=arr[i];
            }
            arr[0]=temp;
            k--;
            }
        }
        
        //System.out.println();
        for(int i=0;i<q;i++){
            int m=sc.nextInt();
            System.out.println(arr[m]);
        }
        
    }
}
