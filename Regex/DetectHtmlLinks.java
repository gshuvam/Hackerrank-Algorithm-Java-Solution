//Problem URL : https://www.hackerrank.com/challenges/detect-html-links
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class DetectHtmlLinks {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            Pattern p=Pattern.compile("<a.*?href=\"(.*?)\".*?>(.*?)<\\/a>");
            Matcher m=p.matcher(s);
            while(m.find()){
                System.out.println(m.group(1)+","+m.group(2).replaceAll("<.*?>","").trim());
            }

        }
    }
}
