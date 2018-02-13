import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        int x = 0;
        while (x < q) {
            long n = in.nextLong();
            int count = 0;
            long product = 1;
            for (int i : prime) {
                product *= i;
                if (product <= n) {
                    count++;
                }
            }
            System.out.println(count);
            x++;
        }
    }
}
