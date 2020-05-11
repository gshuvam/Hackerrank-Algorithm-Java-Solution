//Problem link : https://www.hackerrank.com/challenges/between-two-sets/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class BetweeTwoSets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[] a=new int[m];
        int[] b=new int[n];
        int flag=0;
        int count=0;
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int x=a[m-1];
        int y=b[0];
        
        for(int i=x;i<=y;i++){
            found:{
                for(int j=0;j<m;j++){
                    if(i%a[j]!=0){
                        flag=1;
                        break found;
                    }
                }
                flag=0;
            }
            if(flag==0){
                found1:{
                    for(int j=0;j<n;j++){
                        if(b[j]%i!=0){
                            flag=1;
                            break found1;
                        }
                    }
                    flag=0;
                }
            }
            if(flag==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
