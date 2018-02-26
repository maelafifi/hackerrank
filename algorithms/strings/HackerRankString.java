import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String h = "hackerrank";
            int x = 0;
            int y = 0;
            while(x < s.length()){
                if(y < h.length() && s.charAt(x) == h.charAt(y)){
                    y++;
                }
                x++;
            }
            
            if(y == h.length()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
