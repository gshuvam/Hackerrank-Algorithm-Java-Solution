//problem URl : https://www.hackerrank.com/challenges/almost-sorted
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.ArrayList;
import java.util.Scanner;

public class AlmostSorted {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        sc.close();


        int peak=0,vally=0;
        int index1=0,index2=0,index3=0,index4=0;
        int flag1=0,flag2=0;
        int flag=0;
        for(int i=0;i<=n-1;i++){
            int x=arr.get(i);
            if(i==0){
                if(x>arr.get(i+1)){
                    peak++;
                    index1=i;
                    flag1=1;
                }
            }
            else if(i==n-1){
                if(x<arr.get(n-2)){
                    vally++;
                    if(vally==1){
                        index2=i;
                        flag2=1;
                    }
                    else if(vally==2){
                        index2=i;
                        flag2=1;
                    }
                }
            }
            else {
                if (x > arr.get(i - 1) && x > arr.get(i + 1)) {
                    peak++;
                    if (peak == 1) {
                        index1 = i;
                    } else if (peak == 2) {
                        index3 = i;
                    }
                } else if (x < arr.get(i - 1) && x < arr.get(i + 1)) {
                    vally++;
                    if (vally == 1) {
                        index2 = i;
                    } else if (vally == 2) {
                        index4 = i;
                    }
                }
            }
        }

        if(peak==0 && vally==0){
            System.out.println("yes");
            flag=1;
        }
        else if(peak > 2 && vally>2){
            System.out.println("no");
            flag=1;
        }
        else if(peak==1 && vally==1){
            if(index2-index1==1) {
                if (flag1 == 0 && flag2 == 0) {
                    if(arr.get(index2)>arr.get(index1-1) && arr.get(index1)<arr.get(index2+1)) {
                        System.out.println("yes");
                        System.out.println("swap "+(index1+1)+" "+(index2+1));
                        flag=1;
                    }
                }
                else if (flag1 == 1 && flag2 == 0) {
                    if(arr.get(index1)<arr.get(index2+1)) {
                        System.out.println("yes");
                        System.out.println("swap "+(index1+1)+" "+(index2+1));
                        flag=1;
                    }
                }
                else if (flag1 == 0 && flag2 == 1) {
                    if(arr.get(index2)>arr.get(index1-1)) {
                        System.out.println("yes");
                        System.out.println("swap "+(index1+1)+" "+(index2+1));
                        flag=1;
                    }
                }
                else if (flag1 == 1 && flag2 == 1) {
                    System.out.println("yes");
                    System.out.println("swap "+(index1+1)+" "+(index2+1));
                    flag=1;
                }
                else{
                    System.out.println("no");
                    flag=1;
                }
            }
            else {
                if (flag1 == 0 && flag2 == 0) {
                    if(arr.get(index2)>arr.get(index1-1) && arr.get(index1)<arr.get(index2+1)) {
                        System.out.println("yes");
                        System.out.println("reverse "+(index1+1)+" "+(index2+1));
                        flag=1;
                    }
                }
                else if (flag1 == 1 && flag2 == 0) {
                    if(arr.get(index1)<arr.get(index2+1)) {
                        System.out.println("yes");
                        System.out.println("reverse "+(index1+1)+" "+(index2+1));
                        flag=1;
                    }
                }
                else if (flag1 == 0 && flag2 == 1) {
                    if(arr.get(index2)>arr.get(index1-1)) {
                        System.out.println("yes");
                        System.out.println("reverse "+(index1+1)+" "+(index2+1));
                        flag=1;
                    }
                }
                else if (flag1 == 1 && flag2 == 1) {
                    System.out.println("yes");
                    System.out.println("reverse "+(index1+1)+" "+(index2+1));
                    flag=1;
                }
                else{
                    System.out.println("no");
                    flag=1;
                }
            }

        }
        else if(peak==2 && vally==2){
            if(flag1==0 && flag2==0){
                if(arr.get(index1)<arr.get(index4+1) && arr.get(index4)>arr.get(index1-1) && arr.get(index3)<arr.get(index1) && arr.get(index3)>arr.get(index2)){
                    System.out.println("yes");
                    System.out.println("swap "+(index1+1)+" "+(index4+1));
                    flag=1;
                }
            }
            else if(flag1==0 && flag2==1){
                if(arr.get(index4)>arr.get(index1-1) && arr.get(index3)<arr.get(index1) && arr.get(index3)>arr.get(index2)){
                    System.out.println("yes");
                    System.out.println("swap "+(index1+1)+" "+(index4+1));
                    flag=1;
                }

            }
            else if(flag1==1 && flag2==0){
                if(arr.get(index1)<arr.get(index4+1) && arr.get(index3)<arr.get(index1) && arr.get(index3)>arr.get(index2)){
                    System.out.println("yes");
                    System.out.println("swap "+(index1+1)+" "+(index4+1));
                    flag=1;
                }
            }
            else if(flag1==1 && flag2==1){
                if(arr.get(index3)<arr.get(index1) && arr.get(index3)>arr.get(index2)){
                    System.out.println("yes");
                    System.out.println("swap "+(index1+1)+" "+(index4+1));
                    flag=1;
                }
            }
            else{
                System.out.println("no");
                flag=1;
            }

        }
        if(flag==0){
            System.out.println("no");
        }

    }
}
