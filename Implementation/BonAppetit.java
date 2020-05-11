//Problem Link : https://www.hackerrank.com/challenges/bon-appetit/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class BonAppetit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            if(i!=k){
                sum+=arr[i];
            }
        }
        if(x==sum/2){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(x-sum/2);
        }
    }
}
