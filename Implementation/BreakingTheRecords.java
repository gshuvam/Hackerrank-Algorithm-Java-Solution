//Problem Link : https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/

import java.util.Scanner;

public class BreakingTheRecords {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int lowest=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            if(i==0){
                lowest=k;
                max=k;
            }
            else{
                if(k>max){
                max=k;
                count1++;
            }
                if(k<lowest){
                    lowest=k;
                    count2++;
                }
            }
        }
        System.out.println(count1+" "+count2);
    }
}
