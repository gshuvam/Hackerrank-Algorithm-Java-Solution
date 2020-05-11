//Problem URL : https://www.hackerrank.com/challenges/kaprekar-numbers/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;
import java.util.ArrayList;

public class ModifiedKeplarNumber {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        int flag=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=low;i<=high;i++){
            if(i==1){
                arr.add(1);
                flag=1;
            }
            else if(i>3){
                long square=(long)Math.pow(i,2);
                String s=Long.toString(square);
                //System.out.println(s);

                String s1=s.substring(0,s.length()-(Integer.toString(i)).length());

                String s2=s.substring((s.length()-(Integer.toString(i)).length()),s.length());

                if(Integer.parseInt(s1)+Integer.parseInt(s2)==i){
                    flag=1;
                    arr.add(i);
                }
            }

        }
        if(flag==1){
            for(int i=0;i<arr.size();i++)
                System.out.print(arr.get(i)+" ");
        }
        else{
            System.out.println("INVALID RANGE");
        }
    }
}
