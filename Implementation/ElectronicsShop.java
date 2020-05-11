//Problem link : https://www.hackerrank.com/challenges/electronics-shop/problem
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;
import java.util.Arrays;

public class ElectronicsShop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int k=sc.nextInt();
        int u=sc.nextInt();
        int[] keyboard=new int[k];
        int[] usb=new int[u];
        for(int i=0;i<k;i++){
            keyboard[i]=sc.nextInt();
        }
        for(int i=0;i<u;i++){
            usb[i]=sc.nextInt();
        }
        Arrays.sort(keyboard);
        Arrays.sort(usb);
        int max=0;
        if((keyboard[0]+usb[0])>b){
            System.out.println(-1);
        }
        else{
            for(int i=0;i<k;i++){
                for (int j=0;j<u;j++){
                    if(keyboard[i]+usb[j]<=b && keyboard[i]+usb[j]>max){
                        max=keyboard[i]+usb[j];
                    }
                }
            }
            System.out.println(max);
        }

    }
}
