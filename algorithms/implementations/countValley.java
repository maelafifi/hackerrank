import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int countingValleys(int n, String s) {
        int v = 0; 
        int m = 0;
        int curr = 0;
        String[] arr = s.split("");
        for(int i = 1; i < arr.length; i++){
            if(curr == 0){
                if(arr[i].equals("D")){
                    v++;
                    curr--;
                }
                else{
                    m++;
                    curr++;
                }
            }
            else{
                if(arr[i].equals("D")){
                    curr--;
                }
                else{
                    curr++;
                }
            }
        }
        return v;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
