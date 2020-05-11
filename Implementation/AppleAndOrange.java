//Problem link : https://www.hackerrank.com/challenges/apple-and-orange/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/

import java.util.Scanner;

public class AppleAndOrange{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int count1=0;
        int count2=0;
        for(int i=0;i<m;i++){
            int x=sc.nextInt();
            if((x+a)>=s && (x+a)<=t){
                count1++;
            }
        }
        for(int i=0;i<n;i++){
            int y=sc.nextInt();
            if((y+b)<=t && (y+b)>=s){
                count2++;
            }
        }
        System.out.printf("%d\n%d",count1,count2);
    }
}
