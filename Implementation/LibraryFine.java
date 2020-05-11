//problem URL: https://www.hackerrank.com/challenges/library-fine
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class LibraryFine {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        String d1=sc.nextLine();
        String d2=sc.nextLine();
        String[] s1=d1.split(" ");
        String[] s2=d2.split(" ");
        int[] arr1=new int[3];
        int[] arr2=new int[3];
        for(int i=0;i<3;i++){
            arr1[i]=Integer.parseInt(s1[i]);
            arr2[i]=Integer.parseInt(s2[i]);
        }
        // for(int i=0;i<arr1.length;i++){
        //     System.out.println(arr1[i]+"    "+arr2[i]);
        // }
        if(arr1[2]<arr2[2]){
            System.out.println(0);
        }
        else if(arr1[2]>arr2[2]){
            System.out.println((arr1[2]-arr2[2])*10000);
        }
        else if(arr1[2]==arr2[2]){
            if(arr1[1]<arr2[1]){
                System.out.println(0);
            }
            if(arr1[1]>arr2[1]){
                System.out.println((arr1[1]-arr2[1])*500);
            }
            else if(arr1[1]==arr2[1]){
                if(arr1[0]<=arr2[0]){
                    System.out.println(0);
                }
                else if(arr1[0]>arr2[0]){
                    System.out.println((arr1[0]-arr2[0])*15);
                }
            }
        }
    }
}
