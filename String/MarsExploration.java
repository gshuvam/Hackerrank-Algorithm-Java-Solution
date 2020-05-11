//problem url: https://www.hackerrank.com/challenges/mars-exploration/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class MarsExploration {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toUpperCase();
        sc.close();
        int count=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(i%3==0){
                if(a!='S'){
                    count++;
                }
            }
            else if(i%3==1){
                if(a!='O'){
                    count++;
                }
            }
            else {
                if(a!='S'){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
