import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int anagram(String s){
        if(s.length()%2 != 0){
            return -1;
        }
        int total = 0;
        String s1 = s.substring(0, s.length()/2);
        String s2 = s.substring(s.length()/2);
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
        //System.out.println(map.values().toString());
        for (Integer value : map.values()) {
            total += Math.abs(value);
        }
        return total/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}
