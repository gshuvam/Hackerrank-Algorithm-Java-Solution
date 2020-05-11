//prob url: https://www.hackerrank.com/challenges/find-digits/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int count=0;
            String s=sc.next();
            for(int j=0;j<s.length();j++){
                char c=s.charAt(j);
                if(c!='0'){
                    if((Integer.parseInt(s))%(Integer.parseInt(Character.toString(c)))==0){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
