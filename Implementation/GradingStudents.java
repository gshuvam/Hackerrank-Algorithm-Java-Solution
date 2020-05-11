//Problem link : https://www.hackerrank.com/challenges/grading/
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/

import java.util.Scanner;

public class GradingStudents{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a>=38){
                int k=a%5;
                if(k>=3){
                    System.out.println(a+(5-k));
                }
                else{
                    System.out.println(a);
                }
            }
            else{
                System.out.println(a);
            }
        }
    }
}
