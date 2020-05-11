//Problem Link: https://www.hackerrank.com/challenges/detect-the-email-addresses
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class DetectTheEmailAddress {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<String> list=new ArrayList<String>();
        String regex="\\b[\\w]+(\\.\\w+)?+@[\\w]+(\\.[\\w]+)+\\b";
        Pattern p=Pattern.compile(regex);
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            Matcher m=p.matcher(s);
            while(m.find()){
                if(!list.contains(m.group())){
                    list.add(m.group());
                }
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size()-1;i++){
            System.out.print(list.get(i)+";");
        }
        System.out.print(list.get(list.size()-1));
    }
}
