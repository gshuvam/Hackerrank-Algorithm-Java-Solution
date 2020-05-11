//problem url :https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.ArrayList;
import java.util.Scanner;

public class HackerrankIsAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str="hackerrank";
        for(int i=0;i<n;i++) {
            String s = sc.nextLine().toLowerCase();
            int j = 0;
            if (s.length() < str.length()) {
                System.out.println("NO");
            } else {
                for (int k = 0; k < s.length(); k++) {
                    if (j < str.length() && str.charAt(j) == s.charAt(k)) {
                        j++;
                    }
                }
                if (j == str.length()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();


    }
}
