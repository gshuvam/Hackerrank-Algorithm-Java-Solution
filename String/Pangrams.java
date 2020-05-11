//Problem Link : https://www.hackerrank.com/challenges/pangrams
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Pangrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase().replaceAll(" ","");
        if(s.length()<26){
            System.out.println("not pangram");
        }
        else {
            ArrayList<String> arr = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                String s1 = String.valueOf(s.charAt(i));
                if (!arr.contains(s1)) {
                    arr.add(s1);
                }
            }
            if (arr.size() == 26) {
                System.out.println("pangram");
            } else {
                System.out.println("not pangram");
            }
        }
    }
}
