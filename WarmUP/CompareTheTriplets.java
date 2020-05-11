//Problem link : https://www.hackerrank.com/challenges/compare-the-triplets
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/

import java.util.*;

public class CompareTheTriplets{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int counta=0;
        int countb=0;
        String[] arr1=s1.split(" ");
        String[] arr2=s2.split(" ");
        int j=0;
        for(int i=0;i<arr1.length;i++){
            if(Integer.parseInt(arr1[i])>Integer.parseInt(arr2[j])){
                counta++;
            }
            else if(Integer.parseInt(arr1[i])<Integer.parseInt(arr2[j])){
                countb++;
            }
            j++;
        }
        System.out.println(counta+" "+countb);
    }
}
