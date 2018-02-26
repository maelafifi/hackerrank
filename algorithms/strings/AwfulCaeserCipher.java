import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        char input[] = s.toCharArray();
        String result[] = new String[n];
        
        for(int i  = 0; i < n; i++){
            int shift = k%26;
            int x = (int)input[i];
            if((x < 65) || ((x > 90) && (x < 97)) || (x > 122)){
                result[i] = Character.toString(input[i]);
            }
            else if(Character.isLowerCase(input[i])){
                x = (int)input[i] + shift;
                if(x > 122){
                    x = (x % 122) + 96;
                }
                result[i] = Character.toString((char)x);
            }
            else if(Character.isUpperCase(input[i])){
                x = (int)input[i] + shift;
                if(x > 90){
                    x = (x % 90) + 64;
                }
                result[i] = Character.toString((char)x);
            }
        }
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]);
        }
    }
}
