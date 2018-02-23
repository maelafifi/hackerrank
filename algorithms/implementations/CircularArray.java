import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        //int[] m = new int[q];
        for(int m_i = 0; m_i < q; m_i++){
            int m = in.nextInt();
            System.out.println(a[(n - (k % n)+ m) % n]);
        }
        //circularArrayRotation(a, m);
        System.out.println("");
        in.close();
    }
}
