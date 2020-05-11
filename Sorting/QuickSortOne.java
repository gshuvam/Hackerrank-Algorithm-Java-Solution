//Problem Link:  https://www.hackerrank.com/challenges/quicksort1/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.ArrayList;
import java.util.Scanner;

public class QuickSortOne {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        partition(arr,0,n-1,arr[0]);

    }
    public static void partition(int[] arr,int p,int r,int pivot){
        int i=0;
        int j=1;
//        for(;j<arr.length;j++){
//            if(arr[j]<pivot){
//                int temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//                i++;
//            }
//        }
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for(;j<arr.length;j++){
            if(arr[j]<pivot){
                arr1.add(arr[j]);
            }
            else if(arr[j]>pivot){
                arr2.add(arr[j]);
            }
        }
        //arr[i]=pivot;
        for (Integer integer : arr1) {
            System.out.print(integer + " ");
        }
        System.out.print(pivot+" ");
        for (Integer integer : arr2) {
            System.out.print(integer + " ");
        }
    }

}
