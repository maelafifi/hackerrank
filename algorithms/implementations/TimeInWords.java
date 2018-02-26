import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String [] times = new String[] {
        "zero", 
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
        "twenty",
        "twenty one",
        "twenty two",
        "twenty three",
        "twenty four",
        "twenty five",
        "twenty six",
        "twenty seven",
        "twenty eight",
        "twenty nine"
    };

    static String timeInWords(int h, int m) {
        String result = "";
        String beg = "";
        if(m == 0){
            return times[h] + " o' clock"; 
        }
        if(m > 30){
            result += " to " + times[h+1];
        }
        else{
            result += " past " + times[h];
        }
        if(m == 15 || m == 45){
            beg += "quarter";
        }
        else if(m == 30){
            beg += "half";
        }
        else{
            if(m > 30){
                m = 60-m;
            }
            if(m == 1){
                beg += times[m] + " minute";
            }
            else{
                beg += times[m] + " minutes";
            }
        }
        return beg+result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        String result = timeInWords(h, m);
        System.out.println(result);
        in.close();
    }
}
