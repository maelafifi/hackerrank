import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int saveThePrisoner(int prisoners, int sweets, int start){
        if((start + sweets - 1)%prisoners == 0){
            return prisoners;
        }
        return (start + sweets - 1)%prisoners;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int prisoners = in.nextInt();
            int sweets = in.nextInt();
            int start = in.nextInt();
            int result = saveThePrisoner(prisoners, sweets, start);
            System.out.println(result);
        }
    }
}
