//Problem link : https://www.hackerrank.com/challenges/tutorial-intro/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class TutorialIntro {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            if(k==v){
                System.out.println(i);
                break;
            }
        }
    }
}
