//problem URL : https://www.hackerrank.com/challenges/sherlock-and-squares
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class SherlockAndSquares {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int fst=0;
            int count=0;
            for(int j=n;j<=m;j++){
                double d=Math.sqrt(j);
                if(d==Math.floor(d)){
                    fst=(int)d;
                    count++;
                    break;
                }
            }
            if(fst!=0){
                for(int j=fst+1;j*j<=m;j++){
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
