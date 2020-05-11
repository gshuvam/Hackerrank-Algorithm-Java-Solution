//problem URL : https://www.hackerrank.com/challenges/camelcase
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/

import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<=90){
                count++;
            }
        }
        System.out.println(count+1);
    }
}
