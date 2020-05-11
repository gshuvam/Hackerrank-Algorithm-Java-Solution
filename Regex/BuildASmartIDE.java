//Problem Link : https://www.hackerrank.com/challenges/ide-identifying-comments
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class BuildASmartIDE {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("");
        while(sc.hasNextLine()){
            sb.append(sc.nextLine().trim()).append("$");
        }
        String s=sb.toString();
        String regex1="(//.*?\\$)|(/\\*.*?\\*/\\$)";
        Pattern p=Pattern.compile(regex1);
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.print(m.group().replace("$","\n"));
        }
    }
}
