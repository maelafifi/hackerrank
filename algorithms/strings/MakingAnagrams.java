import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int makingAnagrams(String s1, String s2){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s1.length(); i++){
            if(map.containsKey(s1.charAt(i))){
                int x = map.get(s1.charAt(i));
                x++;
                map.put(s1.charAt(i), x);
            }
            else{
                map.put(s1.charAt(i), 1);
            }
        }
        for(int i = 0; i < s2.length(); i++){
            if(map.containsKey(s2.charAt(i))){
                int x = map.get(s2.charAt(i));
                x--;
                map.put(s2.charAt(i), x);
            }
            else{
                map.put(s2.charAt(i), -1);
            }
        }
        int total = 0;
        //System.out.println(map.values().toString());
        for (Integer value : map.values()) {
            total += Math.abs(value);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
