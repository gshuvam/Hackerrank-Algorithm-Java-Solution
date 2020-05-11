//Problem Link : https://www.hackerrank.com/challenges/find-a-word
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FindAWord {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            int count = 0;
            String test=sc.nextLine();
            Pattern p=Pattern.compile("(?<=[^\\w]|\\b)"+test+"(?=[^\\w]|\\b)");
            for(int j=0;j<n;j++){
                String s=arr[j];
                Matcher m=p.matcher(s);
                while(m.find()){
                    count++;
                }

            }
            System.out.println(count);
        }
    }
}
