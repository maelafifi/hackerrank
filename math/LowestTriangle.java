import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int lowestTriangle(int base, int area){
        area = area + area;
        int height = (int) Math.ceil((double) area/base);
        return height;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int area = in.nextInt();
        int height = lowestTriangle(base, area);
        System.out.println(height);
    }
}
