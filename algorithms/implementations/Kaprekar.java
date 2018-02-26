import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int[] arr = new int[] {1, 9, 45, 55, 99, 297, 703, 999, 2223, 2728, 4950, 5050, 
                                  7272, 7777, 9999, 17344, 22222, 77778, 82656, 95121, 99999};
    static void kaprekarNumbers(int p, int q) {
        int i = 0;
        while(arr[i] < p){
            i++;
        }
        int j = i;
        while(arr[i] <= q){
            System.out.print(arr[i] + " ");
            i++;
        }
        if(i == j){
            System.out.println("INVALID RANGE");
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        kaprekarNumbers(p, q);
        System.out.println("");


        in.close();
    }
}
