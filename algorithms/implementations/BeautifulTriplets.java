import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int beautifulTriplets(int d, int[] arr) {
        int count = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++){
            for (int j = i+1; j < length; j++){
                if (arr[j] - arr[i] == d){
                    for (int k = j+1 ; k < length; k++){
                        if (arr[k]-arr[j] == d){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = beautifulTriplets(d, arr);
        System.out.println(result);
        in.close();
    }
}
