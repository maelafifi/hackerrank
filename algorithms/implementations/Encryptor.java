import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s.replaceAll("\\s+","");
        int rows = (int)Math.floor(Math.sqrt(s.length()));
        int columns = (int)Math.ceil(Math.sqrt(s.length()));
        
        if(rows == columns){
            rows = rows - 1;
        }
        for(int i = 0; i <= rows; i++){
            int j = i;
            while(j < s.length()){
                System.out.print(s.charAt(j));
                 j += columns;
            }
            System.out.print(" ");
        }
        in.close();
    }
}
