//Problem URL : https://www.hackerrank.com/challenges/beautiful-triplets
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;
import java.util.ArrayList;

public class BeautifulTriplets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int count=0;
        for(int i=0;i<n;i++){
            int x=arr.get(i);
            if(arr.contains(x+k) && arr.contains(x+k+k)){
                count++;
            }
        }
        System.out.println(count);
    }
}
