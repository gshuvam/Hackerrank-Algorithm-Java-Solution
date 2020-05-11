//Problem URL : https://www.hackerrank.com/challenges/angry-professor/
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int count=0;
            for(int j=0;j<n;j++){
                int x=sc.nextInt();
                if(x<=0){
                    count++;
                }
            }
            if(count<k){
                System.out.println("YES");
            }
            else
            System.out.println("NO");
        }
    }
}
