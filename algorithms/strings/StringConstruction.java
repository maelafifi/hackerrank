import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int stringConstruction(String s) {
        int count = 0;
        Set<Character> set = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}
