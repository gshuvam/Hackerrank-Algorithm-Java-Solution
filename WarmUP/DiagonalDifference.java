//problem link : https://www.hackerrank.com/challenges/diagonal-difference/submissions/code/153061930
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/

import java.util.*;

public class DiagonalDifference{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int leftDiagonal=0;
        int rightDiagonal=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    leftDiagonal+=arr[i][j];
                if((i+j)==(n-1))
                    rightDiagonal+=arr[i][j];
            }
        }
        System.out.println(Math.abs(leftDiagonal-rightDiagonal));
    }
}
