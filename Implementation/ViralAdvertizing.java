//Problem URL : https://www.hackerrank.com/challenges/strange-advertising/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class ViralAdvertizing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sent=5;
        int liked=0;
        int count=0;
        for(int i=0;i<n;i++){
            liked=(sent)/2;
            count+=liked;
            sent=(liked)*3;  
        }
        System.out.println(count);
    }
}
