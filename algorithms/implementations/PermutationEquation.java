import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String [] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int [] p_inverse = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int px = in.nextInt();
            p_inverse[px] = i;
        }
        for (int i = 1; i <= n; i++) {
            int y = p_inverse[p_inverse[i]];
            System.out.println(y);
        }
    }
}
