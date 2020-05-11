//problem link : https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class DesignerPDFViewer {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[26];
        for(int i=0;i<26;i++){
            arr[i]=sc.nextInt();
        }
        String s=sc.next();
        int l=s.length();
        int max=0;
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            int k=((int) c)-97;
            int val=arr[k];
            if(val>max)
            max=val;
        }
        System.out.println(l*max);
    }
}
