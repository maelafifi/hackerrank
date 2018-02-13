import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();
        for(int i = 0; i < queries; i++){
            int gcd = 1;
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            for(int j = 1; j <= n1 && j <= n2; j++){
            if(n1%j == 0 && n2%j == 0)
                gcd = j;
            }
            int total = n1*n2;
            int largest = gcd*gcd;
            int squares = total/largest;
            System.out.println(squares);
        }
    }
}
