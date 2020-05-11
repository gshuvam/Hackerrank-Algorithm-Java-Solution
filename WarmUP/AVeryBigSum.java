//Problem Link-https://www.hackerrank.com/challenges/a-very-big-sum
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/

import java.util.*;

public class AVeryBigSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=sc.nextLong();
        }
        System.out.println(sum);
    }
}
