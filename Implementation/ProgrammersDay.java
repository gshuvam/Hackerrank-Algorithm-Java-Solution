//Problem Link : https://www.hackerrank.com/challenges/day-of-the-programmer/
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProgrammersDay {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        LocalDate d=LocalDate.of(y,01,01);
        LocalDate pd=null;
        if(y<1918 && y%4==0){
            if(!d.isLeapYear()){
                pd=d.plusDays(254);
            }
            else{
                pd=d.plusDays(255);
            }
        }
        else if(y==1918){
            pd=d.plusDays(268);
        }
        else{
            pd=d.plusDays(255);
        }
        String res=pd.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(res);

    }
}
