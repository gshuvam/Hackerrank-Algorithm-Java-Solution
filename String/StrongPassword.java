//Problem URL : https://www.hackerrank.com/challenges/strong-password/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        String s=sc.next();
        int a=0,b=0,c=0,d=0,e=0;
        if(s.length()<6){
            a=(6-s.length());
        }
        Pattern p1 = Pattern.compile("[0-9]+");
        Matcher m1 = p1.matcher(s);
        if (!m1.find()) {
            b = 1;
        }
        Pattern p2 = Pattern.compile("[A-Z]+");
        Matcher m2 = p2.matcher(s);
        if (!m2.find()) {
            c = 1;
        }
        Pattern p3 = Pattern.compile("[!@#$%^&*()\\-+]");
        Matcher m3 = p3.matcher(s);
        if (!m3.find()) {
            d = 1;
        }
        Pattern p4 = Pattern.compile("[a-z]+");
        Matcher m4 = p4.matcher(s);
        if (!m4.find()) {
            e = 1;
        }
        if(a>=b+c+d+e){
            System.out.println(a);
        }
        else if(a<b+c+d+e){
            System.out.println(b+c+d+e);
        }


    }
}
