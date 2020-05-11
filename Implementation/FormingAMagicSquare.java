//Problem Link : https://www.hackerrank.com/challenges/magic-square-forming/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class FormingAMagicSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] pre = {{8,1,6,3,5,7,4,9,2},{6,1,8,7,5,3,2,9,4},{4,9,2,3,5,7,8,1,6},{2,9,4,7,5,3,6,1,8},{8,3,4,1,5,9,6,7,2},{4,3,8,9,5,1,2,7,6},{6,7,2,1,5,9,8,3,4},{2,7,6,9,5,1,4,3,8}};
        int[] arr=new int[9];
        for(int i=0;i<9;i++){
            int k=sc.nextInt();
            arr[i]=k;

        }
        int min=Integer.MAX_VALUE;
        for(int[] k:pre){
            int count=0;
            for(int i=0;i<9;i++){
                if(k[i]!=arr[i]){
                    count+=Math.abs(k[i]-arr[i]);
                }
            }
            if(count<=min){
                min=count;
            }
        }
        System.out.println(min);

    }
}
