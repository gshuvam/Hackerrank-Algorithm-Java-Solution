//Problem link : https://www.hackerrank.com/challenges/the-birthday-bar/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class BirthDayChocolate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int bday=sc.nextInt();
        int bmonth=sc.nextInt();
        for(int i=0;i<=n-bmonth;i++){
            int sum=0;
            for(int j=i;j<(i+bmonth);j++){
                sum+=arr[j];
            }
            if(sum==bday){
                count++;
            }
        }
        System.out.println(count);
    }
}
