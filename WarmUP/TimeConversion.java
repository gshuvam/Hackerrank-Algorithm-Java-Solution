//Problem link : https://www.hackerrank.com/challenges/time-conversion/
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(LocalTime.parse(s,DateTimeFormatter.ofPattern("hh:mm:ssa")).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
