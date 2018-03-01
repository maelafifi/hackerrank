import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static Object[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> res = new ArrayList<Integer>();
        int small = arr[1] - arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i+1] - arr[i] < small){
                small = arr[i+1] - arr[i];
                res.removeAll(res);
                res.add(arr[i]);
                res.add(arr[i+1]);
            }
            else if(arr[i+1] - arr[i] == small){
                res.add(arr[i]);
                res.add(arr[i+1]);
            }
        }
        Object arr2[] = res.toArray();
        return arr2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Object[] result = closestNumbers(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
