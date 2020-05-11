//problem URL: https://www.hackerrank.com/challenges/cut-the-sticks
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class CutTheStick {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        cal(arr);

    }
    public static void cal(ArrayList<Integer> a){
        System.out.println(a.size());
        Collections.sort(a);
        int k=a.get(0);
        for(int i=0;i<a.size();i++){
            int x=a.get(i);
            x-=k;
            a.set(i,x);
        }
        for(int i=a.size()-1;i>=0;i--){
            if(a.get(i)==0){
                a.remove(i);
            }
        }
        if(a.size()!=0){
            cal(a);
        }

    }
}
