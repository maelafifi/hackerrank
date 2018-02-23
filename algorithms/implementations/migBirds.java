// awful implementation :cries:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                int x = map.get(arr[i]);
                x++;
                map.put(arr[i], x);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        int curr = 1;
        int max = map.get(1);
        if(map.containsKey(2) && map.get(2) > max){
            max = map.get(2);
            curr = 2;
        }
        if(map.containsKey(3) && map.get(3) > max){
            max = map.get(3);
            curr = 3;
        }
        if(map.containsKey(4) && map.get(4) > max){
            max = map.get(4);
            curr = 4;
        }
        if(map.containsKey(5) && map.get(5) > max){
            max = map.get(5);
            curr = 5;
        }
        return curr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
