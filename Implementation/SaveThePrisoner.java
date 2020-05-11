//problem url : https://www.hackerrank.com/challenges/save-the-prisoner
/**
 *Created on Tue May  10 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class SaveThePrisoner {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int start=sc.nextInt();
            int z=(m+start-1)%n;
            if(z==0)
            System.out.println(n);
            else
            System.out.println(z);
        }
    }
}
