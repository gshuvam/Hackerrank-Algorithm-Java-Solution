//Problem Link : https://www.hackerrank.com/challenges/insertionsort1
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;


public class InsertionSortOne {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=arr[n-1];
        //System.out.println(key);
        int pos=binarySearch(arr,0,n-2,key);
        for(int i=n-2;i>=pos;i--){
            arr[i+1]=arr[i];
            for(int j=0;j<n;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();

        }
        arr[pos]=key;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static int binarySearch(int[] arr,int low,int hi,int x){
        int mid=0;
        while(low<=hi){
            mid=low+(hi-low)/2;
            if(arr[mid]==x){
                break;
            }
            if(arr[mid]>x){
                hi=mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
        }
        mid=(hi+low)/2;
        if(x>=arr[mid]){
            return mid+1;
        }
        else
            return mid;
    }
}
