import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if(y1 < y2){
            return 0;
        }
        else if(y1 > y2){
            return 10000;
        }
        else if(m1 == m2 && d1 > d2 && y1 == y2){
            return (d1-d2)*15;
        }
        else if(m1 > m2){
            return (m1-m2)*500;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1, m1, y1, d2, m2, y2;
        d1 = in.nextInt();
        m1 = in.nextInt();
        y1 = in.nextInt();
        d2 = in.nextInt();
        m2 = in.nextInt();
        y2 = in.nextInt();
        System.out.println(libraryFine(d1, m1, y1, d2, m2, y2));
        in.close();
    }
}
