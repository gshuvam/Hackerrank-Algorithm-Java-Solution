//problem URL: https://www.hackerrank.com/challenges/append-and-delete/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class AppendAndDelete {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int n=sc.nextInt();
        int count=0;
        int l1=s1.length();
        int l2=s2.length();
        int l=Math.min(l1,l2);

        for(int i=0;i<l;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }
            else{
                count++;
            }
        }
        if(((l1-count)+(l2-count))>n){
            System.out.println("No");
        }
        else if(((l1-count)+(l2-count))%2==n%2){
            System.out.println("Yes");
        }
        else if(l1+l2<n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
