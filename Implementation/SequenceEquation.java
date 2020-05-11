//Problem URL : https://www.hackerrank.com/challenges/permutation-equation/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;
import java.util.ArrayList;

public class SequenceEquation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        for(int i=1;i<=n;i++){
            System.out.println(arr.indexOf(arr.indexOf(i)+1)+1);
        }
    }
}
