import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int theLoveLetterMystery(String s){
        int total = 0;
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) == s.charAt(s.length() - i - 1)){
                continue;
            }
            if(s.charAt(i) < s.charAt(s.length() - i - 1)){
                total += Math.abs((int)(s.charAt(i) - s.charAt(s.length() - i - 1)));
            }
            if(s.charAt(i) > s.charAt(s.length() - i - 1)){
                total += Math.abs((int)(s.charAt(s.length() - i - 1) - s.charAt(i)));
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }
}
