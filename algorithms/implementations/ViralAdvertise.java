import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int viralAdvertising(int n) {
        int sum = 0;
        int m = 5;
        for(int i = 0; i < n; i++){
            m = (int) Math.floor(m/2);
            sum += m;
            m *= 3;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}
