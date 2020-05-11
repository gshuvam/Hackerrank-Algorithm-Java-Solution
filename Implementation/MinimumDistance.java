//Problem URl : https://www.hackerrank.com/challenges/minimum-distances
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;
import java.util.ArrayList;

public class MinimumDistance {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int flag=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int a=arr.get(i);
            int val=0;
            if(i!=arr.lastIndexOf(a)){
                val=(arr.lastIndexOf(a)-i);
                flag=1;
            }
            if(val<min && val>0){
                min=val;
            }
        }
        if(flag==0){
            System.out.println(-1);
        }
        else
        System.out.println(min);
    }
}
