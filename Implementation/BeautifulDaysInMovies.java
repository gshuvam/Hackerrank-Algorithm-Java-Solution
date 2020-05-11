//Problem URL : https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class BeautifulDaysInMovies {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        for(int i=m;i<=n;i++){
            StringBuilder sb=new StringBuilder("");
            sb.append(i);
            sb.reverse();
            int rev=Integer.parseInt(sb.toString());
            if(Math.abs(i-rev)%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
