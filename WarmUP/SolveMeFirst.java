/*problem link : https://www.hackerrank.com/challenges/solve-me-first/problem*/
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolveMeFirst {


    static int solveMeFirst(int a, int b) {
      	return a+b;

   }

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }
}