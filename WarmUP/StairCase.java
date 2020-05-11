//Problem link : https://www.hackerrank.com/challenges/staircase/
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/

import java.util.Scanner;

public class StairCase{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=0;j<n;j++){
            for(int i=n-(j+2);i>=0;i--){
                System.out.print(" ");
            }
            for(int i=0;i<=j;i++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
