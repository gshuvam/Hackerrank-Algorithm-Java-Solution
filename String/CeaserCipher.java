//Problem URL : https://www.hackerrank.com/challenges/caesar-cipher-1
/**
 *Created on Tue May  5 01:37:44 2020
 *@author: shuva
*/
import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CeaserCipher {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int k1=sc.nextInt();
        int k=k1%26;
        Pattern p=Pattern.compile("[A-Za-z]");

        for(int i=0;i<n;i++){
            String str=String.valueOf(s.charAt(i));
            Matcher m=p.matcher(str);
            if(m.matches()){
                char c= str.charAt(0);
                if(c>=97 && c<=122){
                    c=(char)(97+((c-97+k)%26));
                }
                else if(c>=65 && c<=90){
                    c=(char)(65+(c-65+k)%26);
                }
                str=String.valueOf(c);

            }
            System.out.print(str);
        }

    }
}
