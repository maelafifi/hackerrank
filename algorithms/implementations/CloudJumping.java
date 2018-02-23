import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int jumpingOnClouds(int[] arr, int k, int n) {
        int energy = 100;
        int i = -1;
        while(i != 0){
            if(i == -1){
                i = 0;
            }
            if(arr[(i+k)%n] == 1){
                energy = energy - 2;
            }
            energy = energy - 1;
            i = (i+k)%n;
        }
        return energy;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c, k, n);
        System.out.println(result);
        in.close();
    }
}
