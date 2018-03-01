import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int palindromeIndex(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                if(s.charAt(i+1) == s.charAt(s.length() - 1 - i) && s.charAt(i+2) == s.charAt(s.length() - 2 - i)){
                    return i;
                }
                return s.length() - 1 - i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}
