import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long repeatedString(String s, long n) {
        long remain = n%s.length();
        long nums = n/s.length();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        long total = count*nums;
        for(int i = 0; i < remain; i++){
            if(s.charAt(i) =='a'){
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        in.close();
    }
}
