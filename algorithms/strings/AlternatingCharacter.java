import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int alternatingCharacters(String s){
        int total = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                int x = i;
                total++;
                i++;
                while(i < s.length() - 1){
                    if(s.charAt(x) == s.charAt(i+1)){
                        total++;
                        i++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}
