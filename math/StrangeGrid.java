import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long row = in.nextLong();
        long column = in.nextLong();
        Long out;
        if(row%2 == 0){
            out = ((row-1)/2)*10+(column*2 - 1);
        }
        else{
            out = ((row-1)/2)*10+((column-1) * 2);
        }
        System.out.println(out);
    }
}
