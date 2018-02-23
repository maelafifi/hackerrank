import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for( ; i <= j; i++){
            String s = Integer.toString(i);
            String x = "";
            for(int l = 0; l < s.length(); l++){
                x += s.charAt(s.length() - l - 1);
            }
            if(Math.abs(Integer.parseInt(x) - Integer.parseInt(s))%k == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
