import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();
        int p1, p2, q1, q2, r1, r2;
        for(int i = 0; i < queries; i++){
            p1 = in.nextInt();
            p2 = in.nextInt();
            q1 = in.nextInt();
            q2 = in.nextInt();
            r1 = q1 + q1 - p1;
            r2 = q2 + q2 - p2;
            System.out.printf("%d %d\n", r1, r2);
        }
    }
}
