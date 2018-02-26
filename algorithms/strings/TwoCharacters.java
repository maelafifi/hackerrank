import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int twoCharaters(String s) {
    int count = 0;
    int output = 0;
    char[] c = s.toCharArray();
    if (c.length == 2) {
        if (c[0] != c[1]) {
            count = 2;
        }
    } else if (c.length < 2) {
        count = 0;
    } else {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                output = checkDistinct(c[i], c[j], c);
                if (output > count) {
                    count = output;
                }
            }
        }
    }
    return count;
}
private static int checkDistinct(char c, char c1, char[] ca) {
    StringBuffer sb = new StringBuffer();
    boolean flag = false;
    for (int i = 0; i < ca.length; i++) {
        if (ca[i] == c || ca[i] == c1) {
            sb.append(ca[i]);
        }
    }
    for (int i = 0; i < sb.length() - 1; i++) {
        if (sb.charAt(i) != sb.charAt(i + 1)) {
            flag = true;
        } else {
            return 0;
        }
    }
    if (flag = true) {
        return sb.length();
    }
    return 0;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharaters(s);
        System.out.println(result);
        in.close();
    }
}
