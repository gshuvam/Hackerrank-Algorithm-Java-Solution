//problem link : https://www.hackerrank.com/challenges/plus-minus/submissions/code/153089008
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/

import java.util.Scanner;

public class PlusMinus{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        float noPos=0;
        float noNeg=0;
        float noZero=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                noZero++;
            }
            else if(arr[i]>0){
                noPos++;
            }
            else{
                noNeg++;
            }
        }
        System.out.println(noPos/n);
        System.out.println(noNeg/n);
        System.out.println(noZero/n);
    }
}
