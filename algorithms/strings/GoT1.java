import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String gameOfThrones(String s){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int x = s.length()%2;
        int odd = 0;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int z = map.get(s.charAt(i));
                z++;
                map.put(s.charAt(i), z);
                if(z%2 == 0){
                    odd--;
                }
                else{
                    odd++;
                }
            }
            else{
                map.put(s.charAt(i), 1);
                odd++;
            }
        }
        if(x > 0 && odd == 1 || odd == -1){
            return "YES";
        }
        if(x > 0){
            return "NO";
        }
        if(odd != 0){
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
