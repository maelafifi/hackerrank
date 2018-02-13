import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();
        BigInteger m = new BigInteger("1000000007");
        for(int i = 0; i < queries; i++){
            BigInteger f = new BigInteger(in.next());
            f = f.multiply(f);
            f = f.mod(m);
            System.out.println(f);
        }
        
    }
}
