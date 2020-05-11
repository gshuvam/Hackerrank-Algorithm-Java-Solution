//Problem Link : https://www.hackerrank.com/challenges/kangaroo/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class Kangaroo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int v1=sc.nextInt();
        int x2=sc.nextInt();
        int v2=sc.nextInt();
        int s1=x1;
        int s2=x2;
        int i=1;
        int flag=1;
        if(x1!=x2){
            if(x1>x2){
                while(s1>=s2){
                    s1+=v1;
                    s2+=v2;
                    if(s1==s2){
                        flag=0;
                        
                    }
                }
            }
            else if(x1<x2){
                while(s1<=s2){
                    s1+=v1;
                    s2+=v2;
                    if(s1==s2){
                        flag=0;
                        
                    }
                }
            }
            if(flag==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else{
            System.out.println("NO");
        }
    }
}
