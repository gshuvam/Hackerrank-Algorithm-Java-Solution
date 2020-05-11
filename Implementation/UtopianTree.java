//Problem link : https://www.hackerrank.com/challenges/utopian-tree/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            int height=1;
            int k=sc.nextInt();
            for(int j=1;j<=k;j++){
                if(j%2==1)
                    height=height*2;
                else if(j%2==0)
                    height+=1;
            }
            System.out.println(height);
        }
    }
}
