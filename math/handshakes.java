import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int N = in.nextInt();
            if(N == 1){
                System.out.println(0);
            }
            else{
                int x = (N*(N-1))/2;
                System.out.println(x);
            }
        }
    }
}
