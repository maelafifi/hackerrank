import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        int low = s[0];
        int high = s[0];
        int arr[] = {0,0};
        for(int i = 1; i < s.length; i++){
            if(s[i] < low){
                arr[1] = arr[1] + 1;
                low = s[i];
            }
            else if(s[i] > high){
                arr[0] = arr[0] + 1;
                high = s[i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
