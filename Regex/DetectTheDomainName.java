//Problem Link : https://www.hackerrank.com/challenges/detect-the-domain-name
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class DetectTheDomainName {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<String> arr=new ArrayList<String>();
        String regex="(http|https)://(www\\.|ww2\\.)?(([\\w-]+\\.)+[a-zA-Z0-9]+)(\\W|_)";
        Pattern p=Pattern.compile(regex);
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            Matcher m=p.matcher(s);
            while(m.find()){
                if(!arr.contains(m.group(3))){
                    arr.add(m.group(3));
                }
            }
        }
        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i++){
            System.out.print(arr.get(i)+";");
        }
        System.out.println(arr.get(arr.size()-1));
    }
}
