import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int equalizeArray(int[] arr) {
        // Complete this function
        return 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int total = 0;
        int max = 0;
        for(int arr_i = 0; arr_i < n; arr_i++){
            int x = in.nextInt();
            if(map.containsKey(x)){
                int y = map.get(x);
                y = y+1;
                map.put(x, y);
                if(y > max){
                    max = y;
                }
            }
            else{
                map.put(x, 1);
                if(max == 0){
                    max = 1;
                }
            }
            total++;
        }
        System.out.println(total - max);
        in.close();
    }
}
