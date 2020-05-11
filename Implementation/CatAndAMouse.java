//Problem Link : https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class CatAndAMouse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(Math.abs(a-c)==Math.abs(b-c)){
                System.out.println("Mouse C");
            }
            else if(Math.abs(a-c)>Math.abs(b-c)){
                System.out.println("Cat B");
            }
            else{
                System.out.println("Cat A");
            }
        }
    }
}
