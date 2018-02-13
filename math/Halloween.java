import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();
        for(int i = 0; i < queries; i++){
            long curr = in.nextLong();
            if(curr%2 == 1){
                curr++;
                System.out.println((curr/2)*((curr/2)-1));
            }
            else{
                System.out.println((curr/2)*(curr/2));
            }
        }
    }
}
