//Problem Link : https://www.hackerrank.com/challenges/migratory-birds/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;
import java.util.ArrayList;

public class MigratoryBirds {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] carr={0,0,0,0,0};
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            arr[i]=k;
            carr[k-1]+=1;
        }
        int max=0;
        for(int i=0;i<5;i++){
            if(carr[i]>max){
                max=carr[i];
            }
        }
        for(int i=0;i<5;i++){
            if(carr[i]==max){
                System.out.println(i+1);
                break;
            }
        }
    }
}
