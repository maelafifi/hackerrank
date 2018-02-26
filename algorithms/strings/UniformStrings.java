import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < s.length(); i++){
            int curr = 0;
            curr += s.charAt(i) - 96;
            map.put(curr, 1);
            while(i < s.length() - 1 && s.charAt(i) == s.charAt(i+1)){
                curr += s.charAt(i+1) - 96;
                map.put(curr, 1);
                i++;
            }
        }
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            if(map.containsKey(x)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
