//Problem URL : https://www.hackerrank.com/challenges/reduced-string/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class SuperReducedStrings {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        int i=0;
        //int l=s.length();
        while(s.length()>0 && i<s.length()-1){
            if(s.charAt(i)==s.charAt(i+1)){
                String temp1=s.substring(0,i);
                String temp2=s.substring(i+2);
                s=temp1+temp2;
                i=0;
            }
            else{
                i++;
            }
        }
        if(s.isEmpty()){
            System.out.println("Empty String");
        }
        else{
            System.out.println(s);
        }
    }
}
