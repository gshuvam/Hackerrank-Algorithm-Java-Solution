//problem url : https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int energy=100;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int flag=0;
        while(flag!=1){
            if(i+k==n){
                flag=1;
            }
            i=(i+k)%n;
            if(arr[i]==0){
                energy-=1;
            }
            else if(arr[i]==1){
                energy-=3;
            }

        }
        System.out.println(energy);
    }
}
