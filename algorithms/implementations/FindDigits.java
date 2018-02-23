import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int findDigits(int n) {
        String s = Integer.toString(n);
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '0' && n%Character.getNumericValue(s.charAt(i)) == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }
}
