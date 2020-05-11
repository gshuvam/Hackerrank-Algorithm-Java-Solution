//Problem URL : https://www.hackerrank.com/challenges/extra-long-factorials/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger result=fact(n);
        System.out.println(result);
        
    }
    public static BigInteger fact(int n){
        BigInteger res=BigInteger.ONE;
        if(n<=1){
            return BigInteger.ONE;
        }
        else{
            for(long i=1;i<=n;i++){
                res=res.multiply(BigInteger.valueOf(i));
            }
            return res;
        }
    }
}

