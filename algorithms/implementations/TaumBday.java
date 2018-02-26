import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextInt();
            long w = in.nextInt();
            long x = in.nextInt();
            long y = in.nextInt();
            long z = in.nextInt();
            x = x>y? ((x-y>z)? y+z : x) : x;
            y = y>x? ((y-x>z)? x+z : y) : y;
            System.out.println(b*x+w*y);
        }
        in.close();
    }
}
