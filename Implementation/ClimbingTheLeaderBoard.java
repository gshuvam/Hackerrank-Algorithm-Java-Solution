//Problem link : https://www.hackerrank.com/challenges/climbing-the-leaderboard/
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.util.Scanner;

public class ClimbingTheLeaderBoard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=1;
        int[][] arr=new int[n][2];
        for(int j=0;j<n;j++){
            arr[j][0]=sc.nextInt();
            if(j==0){
                x=1;
            }
            else{
                if(arr[j-1][0]>arr[j][0]){
                    x++;
                }
            }
            arr[j][1]=x;
        }
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            int k=sc.nextInt();
            int index=0;
            if(arr[0][0]<=k){
                index=1;
            }
            else if(arr[n-1][0]>k){
                index=arr[n-1][1]+1;
            }
            else if(arr[n-1][0]==k){
                index=arr[n-1][1];
            }
            else{
                index=search(arr, 0, n-1, k);
            }
            System.out.println(index);
               
        } 
    }
    public static int search(int[][] arr,int low,int high,int x){
        int mid=0;
        while(low<high){
            mid=(low+high)/2;
            if(arr[mid][0]==x){
                break;
            }
            else if(arr[mid][0]>x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        mid=(high+low)/2;
        if(x>=arr[mid][0]){
            return arr[mid][1];
        }
        else{
            return arr[mid][1]+1;
        }
    }
}
