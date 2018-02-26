import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int i = 0;
        int count = 1;
        while(i < s.length()){
            if(Character.isUpperCase(s.charAt(i))){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
    
}
