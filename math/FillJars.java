import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long jars = in.nextLong();
        int queries = in.nextInt();
        BigInteger sum = new BigInteger("0");
        for(int i = 0; i < queries; i++){
            long s = in.nextLong();
            long e = in.nextLong();
            long c = in.nextLong();
            long f = (e - s + 1) * c;
            BigInteger bi = BigInteger.valueOf(f);
            sum = sum.add(bi);
        }
        sum = sum.divide(BigInteger.valueOf(jars));
        System.out.println(sum);
    }
}
