import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.toLowerCase();
        int arr[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 32){
                continue;
            }
            else{
                arr[s.charAt(i)-97] = 1;
            }
        }
        int x = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                System.out.println("not pangram");
                x = 1;
                break;
            }
        }
        //System.out.println(Arrays.toString(arr));
        if(x != 1){
            System.out.println("pangram");
        }
    }
}
