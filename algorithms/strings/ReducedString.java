import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
            for(int i = 1; i < s.length(); i++){
                if(s.charAt(i) == s.charAt(i-1)){
                    StringBuilder sb = new StringBuilder(s);
                    sb.deleteCharAt(i-1);
                    sb.deleteCharAt(i-1);
                    i = 0;
                    s = sb.toString();
                }
            }
        if(s.length() > 0){
            return s;
        }
        return "Empty String";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
