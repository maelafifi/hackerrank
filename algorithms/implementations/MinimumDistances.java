import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int min = -1;
        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            if(map.containsKey(x)){
                if(min == -1){
                    min = i - map.get(x);
                }
                else{
                    if(i - map.get(x) < min){
                        min = i - map.get(x);
                    }
                }
            }
            else{
                map.put(x, i);
            }
        }
        System.out.println(min);
        in.close();
    }
}
