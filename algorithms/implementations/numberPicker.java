import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int pickingNumbers(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++){
            int temp = 1;
            int holder = i;
            while(holder + 1 < arr.size() && Math.abs(arr.get(holder + 1) - arr.get(i)) <= 1){
                temp++;
                holder++;
            }
            if(temp > max){
                max = temp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int a_i = 0; a_i < n; a_i++){
            arr.add(in.nextInt());
        }
        Collections.sort(arr);
        int result = pickingNumbers(arr);
        System.out.println(result);
        in.close();
    }
}
