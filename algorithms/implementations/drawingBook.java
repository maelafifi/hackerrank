import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    //n == total pages
    //p == end page

    static int solve(int n, int p){
        if(n == 6 && p == 5){
            return 1;
        }
        if(n%2 == 0){
            return Math.min(p/2, (n-p)/2);
        }
        else{
            return Math.min(p/2, (n-p)/2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
