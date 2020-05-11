//Problem Link : https://www.hackerrank.com/challenges/drawing-book/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        if(k==1 || k==n)
            System.out.println(0);
        else if(k-1<n-k){
            if(k%2!=0)
                System.out.println((k-1)/2);
            else
                System.out.println((k-1)/2+1);
        }
        else{
            if(n%2==0 && (k+1)==n)
                System.out.println((n-k)/2+1);
            else
                System.out.println((n-k)/2);
        }


    }
}
