//Problem URL : https://www.hackerrank.com/challenges/programming-language-detection
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.io.*;
import java.util.*;

public class ProgrammingLanguageDetection {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("");
        while(sc.hasNextLine()){
            sb.append(sc.nextLine()).append("\n");
        }
        String s=sb.toString();
        
        s.replaceAll("#.*?","");
        s.replaceAll("/\\*.*?\\*/","");
        s.replaceAll("//.*?\n","");
        //System.out.println(s);
        if(s.contains("public static void main")||s.contains("System.out.println")){
            System.out.println("Java");
        }else if(s.contains("#include")){
            System.out.println("C");
        }else{
            System.out.println("Python");
        }

    }
}
