// Problem link : https://www.hackerrank.com/challenges/birthday-cake-candles/submissions
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/

import java.util.Scanner;

public class BirthdayCake{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            if(k>max){
                max=k;
                count=1;
            }
            else if(k==max){
                count++;
            }
            
        }
        System.out.println(count);
        
    }
}
