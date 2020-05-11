//Problem URL: https://www.hackerrank.com/challenges/encryption
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class EncryptionProblem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().replace(" ","");
        int l=s.length();
        double d=Math.sqrt(l);
        int ceil=(int)Math.ceil(d);
        int floor=(int)Math.floor(d);
        if(floor*ceil<l){
            floor=ceil;
        }
        int k=0;
        String c=null;
        String[][] arr=new String[floor][ceil];
        for(int i=0;i<floor;i++){
            for(int j=0;j<ceil;j++){
                if(k<l){
                    c=Character.toString(s.charAt(k));
                    k++;
                    arr[i][j]=c;
                }
                
            }
        }
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j][i]!=null)
                System.out.print(arr[j][i]);
            }
            System.out.print(" ");
        }
    }
}
