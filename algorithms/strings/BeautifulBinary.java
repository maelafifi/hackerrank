import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int beautifulBinaryString(String b) {
        int total = 0;
        for(int i = 0; i < b.length() - 2; i++){
            if(b.charAt(i) == '0' && b.charAt(i+1) == '1' && b.charAt(i+2) == '0'){
                total++;
                StringBuilder sb = new StringBuilder(b);
                sb.setCharAt(i+2, '1');
                b = sb.toString();
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String b = in.next();
        int result = beautifulBinaryString(b);
        System.out.println(result);
        in.close();
    }
}
