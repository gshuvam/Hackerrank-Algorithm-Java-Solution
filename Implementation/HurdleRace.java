//Problem Link: https://www.hackerrank.com/challenges/the-hurdle-race/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class HurdleRace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int max=0;
        for(int i=0;i<n;i++){
            int count=0;
            int k=sc.nextInt();
            if(k>h){
                count=(k-h);
            }
            if(count>max)
            max=count;
        }
        System.out.println(max);
    }
}
